package orderPkg;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPClass {
	@Pointcut("execution(public void Order.setOrderQty(..))")
    public void chkOrderQty() {
    }

    @AfterThrowing(pointcut = "chkOrderQty()", throwing = "exc")
    public void handleOrderException(Exception exc) {
        System.out.println("Exception occurred: " + exc.getMessage());
    }
}
