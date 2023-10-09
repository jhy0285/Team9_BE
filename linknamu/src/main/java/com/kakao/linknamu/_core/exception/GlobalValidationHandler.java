//package com.kakao.linknamu._core.exception;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//
//@Aspect
//@Component
//public class GlobalValidationHandler {
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
//    public void postMapping() {
//    }
//
//
//    @Before("postMapping()")
//    public void validationAdvice(JoinPoint jp) {
//        System.out.println("스고이네");
//        Object[] args = jp.getArgs();
//
//        for (Object arg : args) {
//            if (arg instanceof Errors) {
//                Errors errors = (Errors) arg;
//
//
////                if (errors.hasErrors()) {
////
////                    String errorMessage = errors.getAllErrors().get(0).getDefaultMessage();
////                    System.out.println(errorMessage);
////                    throw new Exception400(DtoExceptionStatus.INVALID_DTO_EXCEPTION);
////                }
//            }
//        }
//    }
//}
