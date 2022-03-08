//package mod1.day23;
//
//import static java.lang.annotation.RetentionPolicy.CLASS;
//
//import java.lang.annotation.Retention;
//
//@Retention(CLASS)
//public @interface In {
//
//}
package mod1.day23;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface In {
	public String factoryName();
}