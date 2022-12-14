package com.zxxz.facade;

/**
 * 门面模式
 */
public class FacadeDemo {

    private static class ServiceA {
        public void save() {
            System.out.println("save");
        }
    }

    private static class ServiceB {
        public void delete() {
            System.out.println("delete");
        }
    }

    private static class ServiceFacade {
        private ServiceA serviceA; //原子操作
        private ServiceB serviceB; //原子操作

        public void service() {
            serviceA.save();
            serviceB.delete();
        }
    }
}
