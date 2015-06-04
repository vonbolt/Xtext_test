package org.xtext.example.impl;

import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.myDsl.Model;

public class MydslModelReader {
	protected static Resource resource;
	
	public Model getModel(){
		return (Model) resource.getContents().get(0);
	}
}
