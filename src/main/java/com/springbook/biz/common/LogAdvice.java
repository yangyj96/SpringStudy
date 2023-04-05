/*
 * package com.springbook.biz.common;
 * 
 * import org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import
 * org.aspectj.lang.annotation.Pointcut; import
 * org.springframework.stereotype.Service;
 * 
 * @Service
 * 
 * @Aspect // Aspect = Pointcut + Advice public class LogAdvice {
 * 
 * @Pointcut("execution(* com.springbook.bix..*Impl.*(..)") public void
 * allPointcut() {}
 * 
 * @Before("allPointcut()") public void printLog() {
 * System.out.println("[����α�] ����Ͻ� ���� ���� �� ����"); }
 * 
 * 
 * @Pointcut("execution(* com.springbook.bix..*Impl.get*(..)") public void
 * getPointcut() {}
 * 
 * }
 */
