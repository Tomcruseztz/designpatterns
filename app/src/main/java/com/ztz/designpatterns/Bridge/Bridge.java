package com.ztz.designpatterns.Bridge;

public class Bridge {

    interface Implementor {
        public void OperationImpl();
    }

    class ConcreteImplementorA implements Implementor {
        public void OperationImpl() {
            System.out.println("具体实现化(Concrete Implementor)角色被访问");
        }
    }

    abstract class Abstraction {
        protected Implementor imple;
        protected Abstraction(Implementor imple) {
            this.imple = imple;
        }
        public abstract void Operation();
    }

    class RefinedAbstraction extends Abstraction {
        protected RefinedAbstraction(Implementor imple) {
            super(imple);
        }
        public void Operation() {
            System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
            imple.OperationImpl();
        }
    }
}