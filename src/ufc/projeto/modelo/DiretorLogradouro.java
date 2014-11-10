package ufc.projeto.modelo;

import java.util.ArrayList;
import java.util.List;


public class DiretorLogradouro implements CriadorLogradouros{
    private final List<Logradouro> logradouros;

    public DiretorLogradouro(){
        logradouros = new ArrayList<>();
    }



    @Override
    public List<Logradouro> obterLogradouros() {

            logradouros.add(new LogradouroPontoDePartida(getClass().getResource("/ufc/projeto/imagens/logradouros/inicio.jpg"), 
                    "Inicio", "Este é o início do jogo! Efeito: saldo aumentado em 100.", false, 100));
           
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/ValfendaRivendell.png"), 
                    "Valfenda Rivendell", "Local de paz e beleza. \n onde muitos conhecimentos e histórias dos elfos e dos homens foram preservados", 200, 80));

            logradouros.add(new Empresa(getClass().getResource("/ufc/projeto/imagens/logradouros/Mineracao2.png"), 
                    "Minas", "Encontre novas materias primas!", 300, 100));
           
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Weathertop.png"), 
                    "Weathertop", "Colina de grande importância! Grande fortaleza do reino de Arthedain, que abriga uma das sete palantíri!", 100, 40));
            
            logradouros.add(new LogradouroEspecial(getClass().getResource("/ufc/projeto/imagens/logradouros/interrogacao.png"), 
                    "O Tesouro Perdido.", "Você encontrou um tesouro! Efeito: saldo aumentado em 300.", new AcaoModificarDinheiroPositivamente(300)));

            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Osgiliath.png"), 
                    "Osgiliath", "Despovoada durante a Terceira Idade, que gradualmente caiu em ruínas durante a Guerra do Anel!", 130, 50));

            logradouros.add(new Empresa(getClass().getResource("/ufc/projeto/imagens/logradouros/PoneiSaltitante.png"),
                    "Ponei Saltitante", "Uma cerveja para a todos embriagar,\n" +
"Uma estalagem para a todos alegrar,\n" +
"Um estalajadeiro para a todos atender,\n" +
"E no Pônei Saltitante hospedá-los.", 241, 135));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/MinasTirith.png"), 
                    "Minas Tirith", "Capital de Gondor na Terceira Idade e da Quarta Era da Terra-média. Originalmente conhecido como Minas Anor.", 230, 63));
       
            logradouros.add(new LogradouroEspecial(getClass().getResource("/ufc/projeto/imagens/logradouros/interrogacao.png"), 
                    "Sauron.", "Você foi encontrado pelo sauron! Efeito: saldo diminuido em 200.", new AcaoModificarDinheiroNegativamente(200)));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/MinasMorgul.png"), 
                    "Minas Morgul", "Antigamente Cidade Fortaleza de Mordor, originalmente chamado de Minas Ithil.", 100, 50));
            //terminar
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Isengard.png"), 
                    "Isengard", "Era um local cheio de árvores, mas foi destruído pelo mago, também criador dos exércitos de Uruk-hai", 80, 45));
            
            logradouros.add(new Empresa(getClass().getResource("/ufc/projeto/imagens/logradouros/Ferreiro.png"), 
                    "Ferraria", "Local de construção de armas para os guerreiros!", 125, 40));
            
            logradouros.add(new LogradouroEspecial(getClass().getResource("/ufc/projeto/imagens/logradouros/interrogacao.png"), 
                    "Grupo de Ents!", "voce encontrou um grupo de ends, e logo será carregado por eles! Efeito: movimentar duas casas!", new AcaoMoverJogador(2)));
            
            logradouros.add(new Empresa(getClass().getResource("/ufc/projeto/imagens/logradouros/Agricutura.png"), 
                    "Agricutura.", "Terras que virão a dar muitos frutos futuramente com uma correta plantação!", 362, 230));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Condado.png"), 
                    "Casinha no Condado", "Terra pequena mas bonita e frutífera, amada por seus habitantes os Hobbits.", 120, 65));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/FangornForest.png"), 
                    "Fangorn Forest", "Quem disse que não da pra morar encima de arvores também?", 230, 40));

            logradouros.add(new LogradouroEspecial(getClass().getResource("/ufc/projeto/imagens/logradouros/interrogacao.png"), 
                    "Grupo de Orcs.", "Você foi emboscado por um grupo de orcs! Efeito: saldo reduzido em 230.", new AcaoModificarDinheiroNegativamente(230)));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Bree.png"), 
                    "Bri", "Aldeia pequena e pouco habitada, semelhante a uma ilha cercada por terras desertas.", 140, 130));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/BaradDur.png"), 
                    "Barad Dur", "Antiga fortaleza principal do Senhor do Escuro, Sauron em Mordor, servindo como sua base de operações eo nexo principal do mal na Terra-média. ", 240, 25));
            
            logradouros.add(new Imovel(getClass().getResource("/ufc/projeto/imagens/logradouros/Edoras.png"), 
                    "Edoras", "Construído no final do vale do Harrowdale, que ficava sob o grande Starkhorn montanha.", 210, 97));	
            
            return logradouros;
    }

}
