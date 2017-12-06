import com.tujia.Emp.entity.People;
import com.tujia.Emp.enums.SexEnum;

public class test {
    public static void main(String[] args) {
        People p1 = new People();
        p1.setSex(SexEnum.MAN.getDesc());

    }
}
