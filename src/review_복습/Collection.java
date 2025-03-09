package review_복습;/*

 - 컬렉션이란?
많은 데이터 요소를 효율적으로 관리하기 위한 자료구조. ArrayList, LinkedList, HashMap 등이 있음.
이들은 제네릭 형식으로 구현되어있음.
 즉, 많은 수의 데이터를 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화 한 객체. 자바에는 이러한 컬렉션들을 위한
 인터페이스와 클래스들이 있다.

 - 컬렉션의 종류
 자료구조 유형에 따라 아래와 같이 구분함.
  1. List : 목록처럼 데이터를 순서에 따라 관리함.
  2. Set : 중복이 허용되지 않는 데이터를 관리함.
  3. Map : 데이터를 Key 와 Value 로 짝을 이루어 관리하며, Key 는 중복을 허용하지 않는다.
  4. Queue : 데이터 In/Out 순서를 FIFO 방식으로 관리함.
  5. Stack : 데티어 In/Out 순서를 LIFO 방식으로 관리함.

   ArrayList, LinkedList, Vector, Stack, HashSet, TreeSet, HashMap, TreeMap 등이 있음.

 - 컬렉션 클래스들이 데이터를 다룰 때 그 데이터는 기본적으로 객체만 가능하다.
  따라서 char, int, float와 같은 기본형은 사용할 수 없고 대신 Wrapper 클래스를 사용해야한다.
  하지만, 오토박싱(auto boxing)과 오토언박싱(auto unboxing)으로 인해 사용자는 마치 기본형을 다룰 수 있는 것처럼 사용할 수 있다.

 * Wrapper 클래스란?
  상황에 따라서 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있다. 즉, 기본 자료형을 참조형 자료형처럼 사용하기 위함이다. 예를 들어,
  int result = 2; 라고 선언한 자료형을 메소드의 매개변수로 넣을 때, 이 기본 자료형을 그대로 사용할 수 없다. 따라서 Wrapper 클래스를 사용한다.
  종류는 다음과 같다.
   기본 타입	래퍼 클래스
    byte	  Byte
    short  	  Short
    int	     Integer
    long	  Long
    float	  Float
    double	  Double
    char	  Character
    boolean	  Boolean
그리고 위와 같은 기본 타입을 래퍼클래스로 바꾸는 것을 박싱, 그 반대를 언박싱이라고 한다.
박싱은 기본 생성자의 매개변수로 해당 값을 넣어주는 것으로 한다.
ex.Integer wrapper = new Integer(2);
반대는 다음과 같은 메서드를 사용한다. 자료형.Value()
ex. int primitive = wrapper.intValue();
하지만, 오토 박싱, 오토 언박싱을 지원해준다.
// 오토박싱 예제
int i = 10;
Integer integerObj = i; // int 타입의 값을 Integer 객체로 자동 변환

// 오토 언박싱 예제
Integer integerObj2 = 20;
int j = integerObj2; // Integer 객체의 값을 int 타입으로 자동 변환


 * 제네릭 : 한 번의 정의로 여러 종류의 데이터 타입을 다룰 수 있도록 하는 방법.
 ex. ArrayList <String> list = new ArrayList<>();
 여기서 <> 가 제네릭이다. 저 안에 데이터타입을 적으면 그 타입으로 클래스가 정의된다. <>안에 들어가는 것을 타입 매개변수라고 한다.

 */