# About

This is a web project to illustrate how to use [Flotr2](http://www.humblesoftware.com/flotr2/index) together with [Flotr2JF](https://github.com/dunse/Flotr2JF) to create graphs.

Check out the running version here: [http://flotr2jfexamplesweb.appspot.com/](http://flotr2jfexamplesweb.appspot.com/)

# Building

**Dependencies:**

Flotr2JF

Maven 2+

  
**Setup workspace:**
    
    
    git clone git://github.com/dunse/Flotr2JF.git
    git clone git://github.com/dunse/Flotr2JFExamplesWeb.git
    

**Build Flotr2JFExamplesWeb**
    
    cd Flotr2JF
    mvn install
    cd ..
    cd Flotr2JFExamplesWeb
    mvn package

This will create the compiled .war file under _target_ directory which can be deployed to an application server of choice.

To use the application, access it through: [http://localhost:PORT/Flotr2JFExamplesWeb/index.html](http://localhost:PORT/Flotr2JFExamplesWeb/index.html)

# Screenshots

## Example 1 - Simple Line Graph

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example1.jpg)

## Example 2 - Two Y Axis, Two lines

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example2.jpg)

## Example 3 - Different Graph Types

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example3.jpg)

## Example 4 - Realtime graph using AJAX (update every 3sec)

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example4.jpg)

## Example 5 - Colour gradient with y axis label

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example5.jpg)

## Example 6 - Tooltip

![](/dunse/Flotr2JFExamplesWeb/raw/master/src/main/java/doc-files/example6.jpg)
