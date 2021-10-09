package aop.aspects;


import aop.Book;
import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private  void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLabrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLabrary()")
//    private void alltrueMethods(){}
//
//    @Before("alltrueMethods()")
//    public void before(){
//        System.out.println("log # 10");
//    }
//



//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary(){}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary() ")
//    private void allReturnAndGetMethodFromUniLibrary(){}
//
//
//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLogginAdvice(){
//        System.out.println("beforeGetLogginAdvice: written Log #1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReternLogginAdvice(){
//        System.out.println("beforeGetLogginAdvice: written Log #2");
//    }
//
//    @Before("allReturnAndGetMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice + written Log #3");
//    }









    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddLogginAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature = " + methodSignature);

        System.out.println("methodSignature.getMethod() = "
                + methodSignature.getMethod());

        System.out.println("methodSignature.getReturnType() = "
                + methodSignature.getReturnType());

        System.out.println("methodSignature.getName() = "
                + methodSignature.getName());



        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + ", автор - " + myBook.getAuthot() +
                            " , год издания -  " + myBook.yearOfPublication);
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет - " + obj);
                }
            }
        }



        System.out.println("beforeGetLogginAdvice: логирование +" +
                " попытки получить книгу/журнал");
        System.out.println("-------------------------------------");

    }




}
