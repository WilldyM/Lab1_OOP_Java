package com.donnu.demo.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toy extends AbstractItem {

}
