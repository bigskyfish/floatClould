package floatClould.user;


/*import org.springframework.security.authentication.encoding.Md5PasswordEncoder;*/
import org.springframework.security.crypto.password.PasswordEncoder;

public class passWordEncode /*implements PasswordEncoder*/{


    /*加盐，盐值*/
    private static final String SALT = "aaa";

    /**
     * 加密方法
     * @param charSequence
     * @return
     */
   /* @Override
    public String encode(CharSequence charSequence) {
        Md5PasswordEncoder Md5PasswordEncoder = new Md5PasswordEncoder();
        return Md5PasswordEncoder.encodePassword(charSequence.toString(),SALT);
    }

    *//**
     * 匹配方式
     * @param charSequence
     * @param s
     * @return
     *//*
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        Md5PasswordEncoder Md5PasswordEncoder = new Md5PasswordEncoder();
        return Md5PasswordEncoder.isPasswordValid(charSequence.toString(),s,SALT);
    }*/
}
