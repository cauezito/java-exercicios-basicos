package heranca;
public class Heranca {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); ERRADO! Uma classe abstrata não pode ser instanciada. É como se fosse um "molde"
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        Tecnico p6 = new Tecnico();
        Visitante p7 = new Visitante();
        
        p2.setNome("Amanda");
        p2.setIdade(22);
        p2.setGen("F");
        
        p3.setNome("Aurélio");
        p3.setEspecialidade("Lingua Portuguesa");
        
        p5.setCurso("Informática");
        p6.pagarMensalidade();
        
        p6.setNome("Gatilda");
        p7.setGen("F");
        
        
    }
    
}
