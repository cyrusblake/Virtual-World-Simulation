package HW2;

import java.util.jar.Attributes;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main2 {

  public static void main (String[] args) {

      try { 
         SAXParserFactory fact = SAXParserFactory.newInstance();
         SAXParser saxParser =  fact.newSAXParser();
         DefaultHandler handle = new DefaultHandler() {

            boolean name = false, description = false, state = false,
            north = false, east = false, south = false, west = false; 

            public void startElement(String uri, String localName, String qName,Attributes attributes) throws SAXException{

               System.out.println("Start Element: " + qName);
               if(qName.equals("name")) name = true;
               if(qName.equals(" description")) description = true;
               if(qName.equals("state")) state = true;
               if(qName.equals("north")) north = true;
               if(qName.equals("east")) east = true;
               if(qName.equals("south")) south = true;
               if(qName.equals(" west ")) west = true;
               

            }

            public void endElement(String uri, String localName, String qName){

               System.out.println("Start Element: " + qName);

            }

            public void characters(char[] ch, int start, int length) throws SAXException{
               if(name){
                  System.out.println("Name: " + new String(ch, start, length));
                  name = false;
               }

               if(description){
                  System.out.println("description: " + new String(ch, start, length));
                  description = false;
               }
            }
         
         };

         saxParser.parse("input.xml", handle);

      } catch (Exception ex){

      }
   }   

}
