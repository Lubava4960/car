public class Main {
    public static void main(String[] args) {
        Car granta = new Car(" Лада","Гранта",1.7, "жёлтый",2015," Россия" );

        System.out.println("Марка автомобиля" + granta.brand + ". " +" Модель "+granta.modeL+". "+
                "Год выпуска " + granta.productionYear + ". " +
                "Страна производства " + granta.origin +
                ". Цвет " + granta.color +
                ". Объём двигателя " + granta.engineaVolume + ". ");
        Car audi = new Car(" Audi", " A8 50 L TDI quattro", 3.0, " черный",2020, " Германия");

        System.out.println("Марка автомобиля" + audi.brand + ". " +" Модель "+audi.modeL+". "+
                "Год выпуска " + audi.productionYear + ". " +
                "Страна производства " + audi.origin +
                ". Цвет " + audi.color +
                ". Объём двигателя " + audi.engineaVolume + ". ");

        Car BMW = new Car(" BMW"," Z8",3.0," черный",2021," Германия");

        System.out.println("Марка автомобиля" + BMW.brand + ". " +" Модель "+BMW.modeL+". "+
                "Год выпуска " + BMW.productionYear + ". " +
                "Страна производства " + BMW.origin +
                ". Цвет " + BMW.color +
                ". Объём двигателя " + BMW.engineaVolume + ". ");

        Car kia = new Car(" Kia"," Sportage 4 поколение ",2.4," красный",2018," Южная Корея");

        System.out.println("Марка автомобиля" + kia.brand + ". " +" Модель "+kia.modeL+". "+
                "Год выпуска " + kia.productionYear + ". " +
                "Страна производства " + kia.origin +
                ". Цвет " + kia.color +
                ". Объём двигателя " + kia.engineaVolume + ". ");

        Car hyundai = new Car(" Hyundai"," Avante",1.6," оранжевый", 2016," Южнея Корея");

        System.out.println("Марка автомобиля" + hyundai.brand + ". " +" Модель "+hyundai.modeL+". "+
                "Год выпуска " + hyundai.productionYear + ". " +
                "Страна производства " + hyundai.origin +
                ". Цвет " + hyundai.color +
                ". Объём двигателя " + hyundai.engineaVolume + ". ");




    }
}