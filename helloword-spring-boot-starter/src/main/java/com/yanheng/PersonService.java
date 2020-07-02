package com.yanheng;

/**
 * @author yanHeng
 * @date 2020-05-25 21:45
 * @description person核心类
 */
public class PersonService {
    private PersonProperties personProperties;

    public PersonService(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    public PersonService() {
    }

    public void sayHello(){
        System.out.println("大家好，我叫: " + personProperties.getName() + ", 今年" + personProperties.getAge() + "岁"
                + ", 性别: " + personProperties.getSex());
    }

}
