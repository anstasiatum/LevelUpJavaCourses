package levelupjavastart.financesreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class AccountWrapper implements InvocationHandler {

    private Account account;

    public AccountWrapper(Account account) {
        this.account = account;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean isClassBlocked = Account.class.isAnnotationPresent(Blocked.class);
        boolean isWithdrawMethodBlocked = Account.class.getDeclaredMethod("withdraw", BigDecimal.class).isAnnotationPresent(Blocked.class);
        boolean isDepositMethodBlocked = Account.class.getDeclaredMethod("deposit", BigDecimal.class).isAnnotationPresent(Blocked.class);

        String unsupportedOperationExceptionText = "The method invocation is blocked";

        switch (method.getName()) {
            case "withdraw":
                if (isClassBlocked || isWithdrawMethodBlocked) {
                    throw new UnsupportedOperationException(unsupportedOperationExceptionText);
                } else {
                    method.invoke(account, args);
                }
                break;
            case "deposit":
                if (isClassBlocked || isDepositMethodBlocked) {
                    throw new UnsupportedOperationException(unsupportedOperationExceptionText);
                } else {
                    method.invoke(account, args);
                }
                break;
            default:
                method.invoke(account, args);
                break;
        }
        return null;
    }
}

