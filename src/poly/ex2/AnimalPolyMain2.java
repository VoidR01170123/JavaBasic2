package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        //부모는 자식을 담을 수 있으므로, Dog 대신 Animal을 써도 된다.
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};


        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    } // 메서드로 추출하는 단축키 : ctrl + alt + m
      // 변수를 합치는 단축키 : ctrl + alt + n
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
