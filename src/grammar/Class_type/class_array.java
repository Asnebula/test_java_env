package grammar.Class_type;

/**
 * @author by Wangshuo5 on 2018/7/23
 */
public class class_array {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = {1,2,4};
        Class[] types = new Class[]{String.class,sth_interface.class};

        for (int i:nums1) {
            System.out.print(i+" ");
        }

        for (int i:nums2) {
            System.out.print(i+" ");
        }

        for (Class i:types) {
            System.out.print(i+" ");
        }

    }

}
