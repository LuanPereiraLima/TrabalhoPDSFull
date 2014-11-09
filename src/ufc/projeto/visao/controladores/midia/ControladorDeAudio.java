package ufc.projeto.visao.controladores.midia;

import java.io.File; 
import java.io.IOException; 
import javax.sound.sampled.AudioFormat; 
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.DataLine; 
import javax.sound.sampled.FloatControl; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.SourceDataLine; 
import javax.sound.sampled.UnsupportedAudioFileException; 
 
public class ControladorDeAudio extends Thread { 
 
    private final String filename;
 
    private final int curPosition;
 
    public ControladorDeAudio(String wavfile) { 
        filename = wavfile;
        curPosition = Audio.NORMAL.obterValor();
    } 
 
    public ControladorDeAudio(String wavfile, int p) { 
        filename = wavfile;
        curPosition = p;
    } 
 
    @Override
    public void run() { 
 
        File soundFile = new File(filename);
        if (!soundFile.exists()) { 
            System.err.println("Arquivo não existe: " + filename);
            return;
        } 
 
        AudioInputStream audioInputStream = null;
        try { 
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (UnsupportedAudioFileException | IOException e1) { 
            return;
        } 
 
        AudioFormat format = audioInputStream.getFormat();
        SourceDataLine auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
 
        try { 
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
        } catch (LineUnavailableException e) { 
            return;
        } catch (Exception e) { 
            return;
        } 
 
        if (auline.isControlSupported(FloatControl.Type.PAN)) { 
            FloatControl pan = (FloatControl) auline
                    .getControl(FloatControl.Type.PAN);
            if (curPosition == Audio.RIGHT.obterValor()) 
                pan.setValue(1.0f);
            else if (curPosition == Audio.LEFT.obterValor()) 
                pan.setValue(-1.0f);
        } 
 
        auline.start();
        int nBytesRead = 0;
        byte[] abData = new byte[Audio.EXTERNAL_BUFFER_SIZE.obterValor()];
 
        try { 
            while (nBytesRead != -1) { 
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) 
                    auline.write(abData, 0, nBytesRead);
            } 
        } catch (IOException e) { 
            return;
        } finally { 
            auline.drain();
            auline.close();
        } 
 
    } 
} 