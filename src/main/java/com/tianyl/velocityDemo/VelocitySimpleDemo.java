package com.tianyl.velocityDemo;

import java.io.StringWriter;
import java.util.Arrays;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class VelocitySimpleDemo {

	public static void main(String[] args) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.setProperty(RuntimeConstants.INPUT_ENCODING, "utf-8");
		ve.setProperty(RuntimeConstants.OUTPUT_ENCODING, "utf-8");
		ve.init();
		Template tpl = ve.getTemplate("vm/simple-demo.vm");
		VelocityContext ctx = new VelocityContext();
		ctx.put("name", "张三");
		ctx.put("age", 55);
		ctx.put("hobbies", Arrays.asList("足球", "篮球", "乒乓球"));
		StringWriter writer = new StringWriter();
		tpl.merge(ctx, writer);
		System.out.println(writer.toString());
	}

}
