package hw1.Task2;

public class TV {
        public String model;
    
        public TV(String model) {
                this.model = model;
            }
    
    
    
        // включение телевизора
        public void StartTV() { 
            System.out.println("Телевизор включен..."); 
        }
    
        // выключение телевизора
        public void StopTV() { 
            System.out.println("Телевизор выключен..."); 
        }
    
        // переключение каналов
        public void SwitchingСhannels() { 
            System.out.println("Смена канала..."); 
        }
}

