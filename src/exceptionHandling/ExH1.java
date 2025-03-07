/*
 - 예외처리란?
예기치 않게 발생하는 에러들에 대하여 사전에 방지하여 프로그램의 정상적인 실행 상태를 유지할 수 있게 하는 것

 - 에러의 발생 요인
 1. 외부적인 요인 : 입력 에러, 하드웨어 문제, 네트워크 연결 에러 등
 
 2. 내부적인 요인 : 개발자의 코드 작성 문제

  - 에러 발생 시점에 따른 구분
 1. 컴파일 에러 : 코드를 실행하기 전에 컴파일 단계에서 에러 발생

 2. 런타임 에러 : 코드 실행 도중 에러 발생


  - 넓은 의미에서 에러와 예외는 차이가 있음. 에러는 발생 시 복구하기 힘든 심각한 문제 (ex. OutOfMemoryError, StackOverFlow 등)
    예외는 개발자의 실수로 인해 발생하는 상대적으로 약한 문제의 수준. 따라서 코드 수정으로 수습이 가능.
    예외처리는 이러한 코드 수정으로 해결 가능한 문제를 처리하는 것.

  - 자바에서는 예외가 발생하면, 예외 클래스로부터 객체를 생성하여 예외를 처리한다.
    자바의 모든 에러와 예외 클래스는 Throwable 클래스에서 확장되며, 모든 예외의 상위 클래스는 Exception 클래스이다.
    즉, 객체 -> Throwable -> Exceptions  -> Runtime Exceptions
                                        -> Other Exceptions
                         -> Errors

    같은 형태이다. 또한 Exception 클래스는 위와 같이 실행 예외 클래스(Runtime Exceptions),와 일반 예외 클래스(Other Exceptions)로
    구분된다.

    - 일반 예외 클래스 : 런타임 에러를 제외한 모든 Exception 클래스와 하위 클래스들. 컴파일러가 코드 실행 전에 예외 처리 코드 여부를 검사하기 때문에
    Checked 예외라고도 한다.
    - 실행 예외 클래스 : 런타임 시 발생하는 실행 예외 클래스와 하위 클래스들. 컴파일러가 예외 처리를 검사 안하므로, Unchecked 예외라고도 한다.


    그렇다면 잠재적 에러에 대해 어떻게 대비하는가?(예외처리방법)
     - try - catch 문법
        -> try 블록 안에 예외가 발생할 수 있는 코드를 작성한다. 만약, 작성한 코드에서 예외가 발생하지 않으면, catch 블록은 실행되지 않으며,
        예외 처리를 종료하거나 finally 블록이 실행된다.
        -> catch 블록은 ,try 블록에서 예외가 발생하면 실행된다. 여러 종류의 예외 처리가 가능하다. ()안에 Exception 클래스를 작성하면
        모든 예외에 대한 처리가 가능하며, 특정 예외에서만 처리하고 싶다면 특정 예외에 대한 클래스를 작성한다.
        catch 블록이 여러 개인 경우, 일치하는 하나의 catch만 실행되고 예외처리를 종료하거나 finally 블록으로 넘어간다.


     - finally 블록
       -> 옵션으로 필수 작성은 아니다. 만약 작성한다면, 예외 발생 여부와 상관없이 반드시 실행한다.

       ex) try {
         //예외가 발생할 가능성이 있는 코드
         } catch (ExceptionType1 e1){
         // ExceptionType1 이 발생했을 때 실행하는 코드
         } catch (ExceptionType2 e2){
         // ExceptionType2 가 발생했을 때 실행하는 코드
         } finally{
         //예외 발생 여부와 상관없이 무조건 실행
         }

         또한, 괄호 안의 e와 getMessage(), toString()을 사용해 예외에 대한 정보를 얻을 수도 있다.

         * 예외 처리 catch 는 순차적으로 진행하므로, 더 구체적인 예외처리를 위에 배치하는 게 좋다.



         - 예외 전가 : 에러 발생 시, try-catch 문이 아니라, 예외를(메서드를) 호출한 곳으로 예외를 떠넘겨서 처리하는 것이다.
         메서드 선언부 끝에 throws 키워드를 작성해서 발생할 수 있는 예외들을 쉼표로 구분해 나열하는 것으로 작성한다.
         ex) void methodEx() throws NullPointerException, ArrayIndexOutOfBoundsException,...{ ~~}
         간단하게 말로 풀어서 설명하자면, 메소드 a 에서 예외가 발생하는데, 이곳에서 발생하는 예외를 이 메소드 내에서 처리하는 게 아니라,
         이를 호출한 곳(ex. main)에 try-catch 같은 걸 만들어서 처리한다는 것이다.

         - 의도적 예외 발생 : throw 키워드를 사용해 의도적으로 예외를 발생시킬 수 있다.
         ex)
         public class ThrowException {
        public static void main(String[] args) {
        try {
            Exception intendedException = new Exception("의도적인 예외");
            throw intendedException;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
           위 코드를 보면, 의도적으로 발생할지도 모르는 예외를 throw 를 통해 발생시켜, catch를 실행하는 것이다. 즉, 사전 대응 코드인 것이다.




 */