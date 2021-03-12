package day0312;
/* ArrayUtil의 메소드를 실습해보는 클래스
 * 
 */
import util.StringUtil;
import util.ArrayUtil;
public class Ex02ArrayUtil {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        String[] array = {"a","b","c","d","e","f","e","d","c","b","a"};
        
        
        //1.size() 
        System.out.println("arr.size() : " + ArrayUtil.size(arr) );
        System.out.println("arr.size() : " + ArrayUtil.size(arr));
        System.out.println();
        
        //2.contains()
        System.out.println("ArrayUtil.contains(arr,3) : " + ArrayUtil.contains(arr, 3));
        System.out.println("ArrayUtil.contains(arr,30) : " + ArrayUtil.contains(arr, 30));
        System.out.println("ArrayUtil.contains(arr,a) : " + StringUtil.contains(array, 3));
        System.out.println("ArrayUtil.contains(arr,p) : " + StringUtil.contains(array, 30));
        System.out.println();
        
        //3. indexOf()
        System.out.println("ArrayUtil.indexOf(arr,4) : " + ArrayUtil.indexOf(arr, 4));
        System.out.println("ArrayUtil.indexOf(arr,40) : " + ArrayUtil.indexOf(arr, 40));
        System.out.println();
        
        //4. lastIndexOf()
        System.out.println("ArrayUtil.indexOf(arr,4) : " + ArrayUtil.lastIndexOf(arr, 4));
        System.out.println("ArrayUtil.indexOf(arr,40) : " + ArrayUtil.lastIndexOf(arr, 40));
        System.out.println();
        
        //5. add()
        arr= new int[0];
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        arr = ArrayUtil.add(arr,11);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println();
        
        //6. add(index)
        System.out.println("arr[0] " + arr[0]);
        arr= ArrayUtil.add(arr, 0,10);
        System.out.println("arr[0] :" + arr[0]);
        
        System.out.println("arr[1] : " + arr[1]);
        arr=ArrayUtil.add(arr, 1,232);
        System.out.println("arr[1] : " + arr[1]);
        arr=ArrayUtil.add(arr, 1, 777);
        System.out.println("arr[1] : " + arr[1]);
        
        //불가능한 인덱스에 추가하려는 경우
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        //arr의 -3번째에 100을 넣어라.
        arr = ArrayUtil.add(arr, -3,100);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        //arr의 100번째에 -3을 넣어라
        arr=ArrayUtil.add(arr, 100, -3);
        
        //7.removeByIndex()
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        //0번째 제거하기전
        System.out.println("arr[0] : " + arr[0]);
        arr=ArrayUtil.removeByIndex(arr, 0);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        //0번째 제거한 후
        System.out.println("arr[0] : " + arr[0]);
        
        
        //불가능한 인덱스를 제거해보자.
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        arr=ArrayUtil.removeByIndex(arr, -1);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        arr=ArrayUtil.removeByIndex(arr, 150);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        
        
    }

}
