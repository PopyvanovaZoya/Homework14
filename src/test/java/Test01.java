import org.junit.Assert;
import org.junit.Test;

public class Test01 {

    @Test
    public void testReturnNewArray1(){
        Sample01 sample01 = new Sample01();
        Assert.assertEquals(new int []{1,2}, sample01.returnNewArray(new int[]{1,3,6,7,8,4,1,2}));
     }

    @Test
    public void testReturnNewArray2(){
        Sample01 sample01 = new Sample01();
        Assert.assertEquals(new int []{1,2}, sample01.returnNewArray(new int[]{5,3,6,7,8,2,1,2}));
    }
    @Test
    public void testReturnNewArray3(){
        Sample01 sample01 = new Sample01();
        Assert.assertEquals(new int []{1,2}, sample01.returnNewArray(new int[]{5,3,4,7,8,2,1,2}));
    }

    @Test
    public void testReturnNewArray4(){
        Sample01 sample01 = new Sample01();
        Assert.assertEquals(new int []{7,8,4,1,2}, sample01.returnNewArray(new int[]{5,3,4,7,8,4,1,2}));
    }
}
