package org.xtext.example.impl.handlers;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.xtext.example.impl.MydslModelReader;
import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.Model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionController {
	
	private ActionController(){
		
	}

	public static void run(){
		
		log.debug("It runs!");
		
		MydslModelReader mydslreader = new MydslModelReader();
		Model model = mydslreader.getModel();

		for(Import importfile : model.getImports()){
			importfile.getImportStyle();
			new ArrayList<Object>(Arrays.asList(importfile.getImport_num())));
		}
	}
}
