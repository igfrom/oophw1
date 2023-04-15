package hw1.Task2;

public class Cat {
    public String name;

    public Cat(String n) {
            this.name = n;
        }

    // кот отвечает
    public void AnswerCat() { 
        System.out.println("Мяу..."); 
    }

    // котик кусается
    public void CatKus() { 
        System.out.println("Кусь-Кусь...");
    }
    
    // не пускает
    public void NoPuti() { 
        System.out.println("Нипутю"); 
    }
}