package hw1.Task2;

public class Program {
    public static void main(String[] args) {

        Human man = new Human("Goga", "husband");
        Human woman = new Human("Osa", "wife");
        TV TCL = new TV("TCL");
        Cat cat = new Cat("Kotofei");

        man.QueryHuman();
        if (woman.AnswerHuman()) {
            TCL.StartTV();
            TCL.SwitchingСhannels();
            TCL.StopTV();
        } else {
            man.SleepHuman();
        }

        man.CallCat();
        cat.AnswerCat();
        woman.FasCat();
        cat.CatKus();
        man.Oputi();
        cat.NoPuti();
}
}