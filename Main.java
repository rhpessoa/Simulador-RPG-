class Main {
  public static void main(String[] args) {

    Mago mg = new Mago(200, "Yuumi", 100);
    System.out.println(mg.toString());
    mg.takeDamage(10);

    System.out.println("-----------------------------");

    Aprendiz nv = new Aprendiz(200, "Mestra", 100, "Yuumi");
    System.out.println(nv.toString());
    nv.takeDamage(10);

    System.out.println("-----------------------------");

    Feiticeiro wf = new Feiticeiro(200, "Morgana", 100, "Fire");
    System.out.println(wf.toString());
    wf.takeDamage(10);

    System.out.println("-----------------------------");

    Guerreiro wr = new Guerreiro(20, 15, "Garen", 1000);
    System.out.println(wr.toString());
    wr.takeDamage(10);
    System.out.println("-----------------------------");
    Arqueiro ea = new Arqueiro(10, 20, "Varus", 135, "Chuva de flechas");
    System.out.println(ea.toString());
    ea.takeDamage(10);
    System.out.println("-----------------------------");
    Soldado wb = new Soldado(25, 20, "Patheon", 135, "Couraça de Boitatá");
    System.out.println(wb.toString());
    wb.takeDamage(10);
  }

}