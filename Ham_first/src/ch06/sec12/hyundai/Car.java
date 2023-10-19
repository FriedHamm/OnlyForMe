package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSesonTire;
public class Car {

    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();

    AllSesonTire tire3 = new AllSesonTire();
    SnowTire tire4 = new SnowTire();

    // 진짜 간단히 생각하면
    //public은 어디서든 가능 그래서 클래스가 public이면 어디서든 접근 가능함 default는 안됨
    // 생성자의 경우에는 new를 사용해서 생성자에 접근을 할 수 있냐 없냐를 가르는 거임.
    // 그래서 public이면 어디서든 default면 같은 패키지, private이면 내부에서만 protected면 상속까지

}
