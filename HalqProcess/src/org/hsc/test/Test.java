//package org.hsc.test;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Arrays;
//import java.util.Enumeration;
//import java.util.Properties;
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.swing.JFileChooser;
//
//import org.compiere.model.MRole;
//import org.compiere.util.CLogger;
//import org.compiere.util.Env;
//import org.hsc.model.MHSCHalqProject;
//
//import word.api.interfaces.IDocument;
//import word.utils.Utils;
//import word.w2004.Document2004;
//import word.w2004.Document2004.Encoding;
//import word.w2004.elements.BreakLine;
//import word.w2004.elements.Heading1;
//import word.w2004.elements.Heading2;
//import word.w2004.elements.Heading3;
//import word.w2004.elements.HyperLink;
//import word.w2004.elements.Image;
//import word.w2004.elements.PageBreak;
//import word.w2004.elements.Paragraph;
//import word.w2004.elements.ParagraphPiece;
//import word.w2004.elements.Table;
//import word.w2004.elements.tableElements.TableEle;
//import word.w2004.style.Font;
//import word.w2004.style.HeadingStyle.Align;
//
//public class Test {
//	public static void main(String[] args) {
//		/** Logging */
///*
//		System.out.println("hello, how are you today");
//		org.compiere.Adempiere.startupEnvironment(true);
//		int projectID = 1000016;
//
//		MHSCHalqProject project = new MHSCHalqProject(Env.getCtx(), projectID, null);
//		System.out.println(project.getName());
//		
//		IDocument myDoc = new Document2004();
//        // myDoc.setPageOrientationLandscape();
//        // default is Portrait be can be changed.
//        myDoc.encoding(Encoding.UTF_8); //or ISO8859-1. Default is UTF-8
//        
//        myDoc.addEle(BreakLine.times(1).create()); // this is one breakline
//
//        // Headings
//        myDoc.addEle(Heading1.with(project.getName()).create());
//        
//
//
//
////        ======================
//        String myWord = myDoc.getContent();
//        File fileObj = new File("d:/noum/AnnualReport.doc");
//
//        PrintWriter writer = null;
//        try {
//            writer = new PrintWriter(fileObj);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        
//
//        writer.println(myWord);
//        writer.close();
//        
//        
//  */      
//		org.compiere.Adempiere.startupEnvironment(true);
//		MRole registerUserRole = MRole.getOf(Env.getCtx(), "Name = 'Register User'")[0];
//		System.out.println(registerUserRole.get_ID() + " " + registerUserRole.getName());
//		
//	}
//}
