package baitap2;

public class ValidPhoneNumber {
    private String str;
    public ValidPhoneNumber(String str){
        this.str = str;
    }

    private final String FORMAT_PHONE = "^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)$";

    public boolean isValid(){
     return str.matches(FORMAT_PHONE);
    }

    public static void main(String[] args) {
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber("(84)-(0978489648)");
        ValidPhoneNumber validPhoneNumber1 = new ValidPhoneNumber("(a8)-(22222222)");
        System.out.println(validPhoneNumber1.isValid());
        System.out.println(validPhoneNumber.isValid());
    }
}
