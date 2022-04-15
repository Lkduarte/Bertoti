
<h4><p align="center"><b>Aluno:</b> Lucas Nunes Duarte do Nascimento <b>RA:</b> 1460482021031</h4>

<h2 align="center">Ciclo de Vida do Desenvolvimento de Software (Plataforma de Ensino)</h2>
<br> <p align="justify"> O ciclo de vida de um software é uma estrutura que contém processos, atividades e tarefas envolvidas no desenvolvimento, operação e manutenção de um produto de software, abrangendo a vida do sistema, desde a definição de seus requisitos até o término de seu uso.</br>
<p align="justify"> Processo de software é o conjunto de atividades que constituem o desenvolvimento de um sistema computacional. Estas atividades são agrupadas em fases, como: definição de requisitos, análise, projeto, desenvolvimento, teste e implantação.</br>

  ## :clipboard:Requisitos

  <p align="justify">Dentro da Engenharia de Software, os requisitos são uma das partes mais importantes no ciclo de desenvolvimento de um software. São eles que definem a estrutura e comportamento do software desenvolvido. <br>
</p>
Esses requisitos são divididos em duas categorias:

* Requisitos Funcionais
* Requisitos Não Funcionais.

<h3> :pushpin:Requisitos Funcionais:</h3>
<div align="center">
<img alt="requisitos funcionais" src="https://user-images.githubusercontent.com/71477357/161325984-2eb0877e-e0a9-4315-b9ff-93cbf0b696dc.png" width="600" height="500/">
  <br>
  <br> <p align="justify"> Dentro da engenharia de uma empresa de software podemos destacar o requisito funcional, onde há a materialização de uma necessidade ou solicitação realizada por um software.<br>
<br>Os requisitos funcionais são de extrema importância no desenvolvimento de aplicativos, pois, sem eles não há funcionalidades nos sistemas. Seus modelos devem ser construídos em um nível de entendimento claro e objetivo, além de um código fonte totalmente aplicável.<br>
 </p>
 </div>
 <br>
<h3> :pushpin:Requisitos Não Funcionais:</h3>
<div align="center">
<img alt="requisitos não funcionais" src="https://user-images.githubusercontent.com/71477357/161327949-610294ca-536a-4c64-a48d-d1f4d1cbc4c7.png">
    <br>

  <br> <p align="justify">Uma vez que os <b>Requisitos Funcionais</b> definem o que o sistema fará, a Engenharia de Software afirma que os <b>Requisitos Não Funcionais</b> definem como o sistema fará, embora não seja tão claro assim essa definição. Os <b>Requisitos não Funcionais</b> não estão relacionados diretamente às funcionalidades de um sistema.<br>
<br>Também chamado de atributos de qualidade ainda assim é de grande importância no desenvolvimento do sistema. Tratados geralmente como premissas e restrições técnicas de um projeto os <b>requisitos não funcionais</b> são praticamente todas as <b>necessidades que não podem ser atendidas através de funcionalidades.</b><br>
 </p>
 </div>

<div id="#projeto">
  
  ## :construction:Projeto
  
<p align="justify">Durante o planejamento do desenvolvimento de um software, uma ferramenta que facilita a visualização geral da estrutura e das relações das classes é o <b>Diagrama de Classes</b>.<br>
<br>Com o <b>Diagrama de classes</b>, podemos identificar e visualizar todos os atributos e métodos referentes a cada classe do objeto.<br>
<div>
<div align="center">
<img alt="diagrama de classes" src="https://user-images.githubusercontent.com/71477357/161331627-c209206f-c6aa-4193-a83b-0cb88146285b.png">
</div>
  
  ## :game_die:Desenvolvimento
  
<p>Aqui utilizamos a Linguagem de programação JAVA para codificar as classes anteriores.</p>
  
</div>

<div align="center">
<img alt="Plataforma de Ensino" src="https://user-images.githubusercontent.com/71477357/161332143-ae0c2ffd-59f8-4a24-8708-0cd6749ea366.png">
</div>
  
  ~~~java
import java.util.LinkedList;
import java.util.List;
        
public class PlataformaEnsino {
    
    private List<Pessoa> pessoas = new LinkedList<Pessoa>();
    private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
    
    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public Pessoa buscarPessoaPorNome(String nome){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }  
        return null;
    }
    
    public Pessoa buscrPesoaPorMatricula(String matricula){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getMatricula().equals(matricula)){
                return pessoa;
            }
        }
        return null;
    }
    
    public Pessoa buscarPessoaPorTipo(String tipo){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getTipo().equals(tipo)){
                return pessoa;
            }
        }
        return null;
    }
    
    public Disciplina buscarDisciplinaPorNome(String nome){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getNomeDisciplina().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplinaPorProfessor(String professor){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getProfessor().equals(professor)){
               return disciplina;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplinaPorSemestre(String semestre){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getSemestre().equals(semestre)){
                return disciplina;
            }
        }
        return null;
    }
}
~~~
  
<div align="center">
<img alt="Pessoa" src="https://user-images.githubusercontent.com/71477357/161333992-111a5ff5-51e1-45a0-84d8-1c739b294170.png">
</div>
  
  ~~~java
public class Pessoa {
    
    private String nome;
    private String matricula;
    private String tipo;

    public Pessoa(String nome, String matricula, String tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
~~~

<div align="center">
<img alt="Disciplina" src="https://user-images.githubusercontent.com/71477357/161334162-010d4f21-78c8-41d4-aede-4d0fcd88822a.png">
</div>

  ~~~java
public class Disciplina {
    
    private String nomeDisciplina;
    private String professor;
    private String semestre;

    public Disciplina(String nomeDisciplina, String professor, String semestre) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.semestre = semestre;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
~~~
  
### Autor
---

Feito por Lucas Nunes 👋🏽 Entre em contato!
  
[![Github Badge](https://img.shields.io/badge/-Github-181717?style=flat-square&labelColor=181717&logo=github&logoColor=white&link=https://github.com/Lkduarte/)](https://github.com/Lkduarte/) 
[![Linkedin Badge](https://img.shields.io/badge/-Lucas-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https:www.linkedin.com/in/lucas-nunes-nascimento/)](https://www.linkedin.com/in/lucas-nunes-nascimento/) 
[![Gmail Badge](https://img.shields.io/badge/-luke_nunes@hotmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:luke_nunes@hotmail.com)](mailto:luke_nunes@hotmail.com)
