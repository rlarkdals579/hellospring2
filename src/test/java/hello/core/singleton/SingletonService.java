package hello.core.singleton;

/**
 * 싱글톤 패턴이란?
 * <p>
 * 클래스의 인스턴스가 딱 1개만 생성되는 것을 보장하는 디자인 패턴이다.
 * 따라서 객체 인스턴스를 2개 이상 생성하지 못하도록 막아야한다.
 * private 생성자를 사용해서 외부에서 임의로 new 키워드를 생성하지 못하도록 막아야함.
 */

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");

    }
}
