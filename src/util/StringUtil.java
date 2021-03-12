package util;

public class StringUtil {
    public static int size(String[] array) {
        return array.length;
        
    }
   
    public static boolean contains(String[] array, String element) {
        for(int i =0 ; i < size(array); i++) {
            if(array[i] == element) {
                return true;
            }
        }
        return false;

    }
    public static int indexOf(String[] array, String element) {
        for(int i=0; i< size(array); i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    //4. 파라미터로 배열과 int값을 넘겨받고, 해당 int 값이 가장 나중에 등장하는 index를 알려주는
    //  lastIndexOf() 메소드.
    //  단, 해당 int 값이 배열에 존재하지 않을 경우, -1이 return 된다.
    public static int lastIndexOf(String[] array, String element) {
        for(int i =size(arr)-1 ; i >=0; i--) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    
    //5. 파라미터로 배열과 int 값을 넘겨 받고, 해당 배열의 크기를 1 늘려주고
    //   그리고 가장 마지막 인덱스에 해당 int 값을 할당하고 새로운 배열을 리턴해주는
    //   add() 메소드
    
    public static int[] add(String[] array, String element) {
        //1. arr을 임시로 다른 배열에 저장한다.
        int[] temp =arr;
        //2. 배열의 크기를 늘린다.
        arr= new int[size(arr)+1];
        //3. for문을 이용해서 임시 배열에 값들을 늘어난 arr에 차례대로 넣는다.
        for(int i =0; i< size(temp); i++) {
            arr[i]=temp[i];
        }
        //4. element를 제일 마지막에 넣는다.
        arr[size(arr)-1] = element;
        //5. arr을 리턴한다.
        return arr;
    }
    
    //6. 파라미터로 배열, 추가할 인덱스 , 추가할 엘리먼트를 넘겨받고 해당 배열의 크기를 1 늘려주고
    //   지정된 인덱스에 새로운 엘리먼트를 할당하는 add() 메소드
    public static int[] add(String[] array, String index , String element) {
        //만약 index가 불가능한 index일 경우
        //arr을 그대로 리턴한다.
        if(!(index >= 0 && index <size(array))) {
            return array;
        }
        //1. 현재 배열을 temp에 복사
        int[] temp = arr;
        //2. arr의 크기를 1 증가
        arr = new int[size(arr)+1];
        //3.0~index -1 까지의 값을
        // temp 에서 arr에 복사한다.
        for(int i =0; i< index; i++) {
            arr[i]= temp[i];
        }
        //4. arr[index]에 element를 할당한다.
        arr[index] = element;
        //5. temp로부터 복사하지 않은 것들을 복사해온다.
        for(int i =index +1; i < size(arr); i++) {
            arr[i]= temp[i-1];
        }
        //6. 새로만들어진 arr을 리턴한다.
        return arr;
    }
    
   //7.파라미터로 배열과 제거할 index를 받아서
    //해당 인덱스를 제거하고
    // 크기도 1칸 줄어든 배열을 리턴하는 removeByIndex() 메소드
    public static int[] removeByIndex(int[] array, String index) {
        //1.만약 index가 유효하지 않은 index일 경우,
        //  arr을 그대로 리턴한다.
        if(!(index >=0 && index <size(array))) {
            return array;
        }
        
        //2. 현재 배열의 내용을 임시로 int[] temp에 저장한다,
        int[] temp = array;
        
        //3. arr을 크기가 1 줄어든 배열로 선언한다.
        array = new int[size(array)-1];
        
        //4.temp에서 0~index -1 까지 복사한다.
        for(int i =0; i<index ; i++) {
            array[i] = temp[i];
        }
        
        //5.temp에서 index+1~ 끝까지 복사한다.
        for(int i = index+1 ; i< size(array); i++) {
            array[i] = temp[i+1];
        }
        
        return array;
    }
    
    //8.파라미터로 배열과 제거할 엘리먼트를 넘겨 받아서
    //그것과 일치하는 엘리먼트를 제거하는 removeByElement() 메소드
    public static int[] removeByElement(int[] array, String element) {
        //우리가 위에 7번에 구현해 놓은
        //removeByIndex는 , 우리가 인덱스 값을 주면 해당 인덱스가 유효한 인덱스면
        //알아서 제거해준다.
        // 그렇다면 우리가 그 앞서 3번에서 만들어 놓은 indexOf메소드를 사용하면,
        //파라미터로 넘어온 arr에서 element의 인덱스를 알 수 있다.
        //만약 indexOf가 arr에서 element가 존재하지 않아서
        //-1리턴하면?
        //removeByIndex가 알아서 처리해주기 때문에
        //우리가 걱정할 사항 아님!
        //따라서 . 이 메소드는 removeByIndex를 실행한 결과값을 리턴하는데
        //파라미터에 들어갈 인덱스는 indexOf()메소드가 구해주는 형태가 된다.
        
        return removeByIndex(array, indexOf(array,element));
        
    }
    
}

