USYC
   
Name: Alejandro Rodriguez

Date Repo. made: 2026-05-28, yyyy-mm-dd @ 1:27 PM

Essentially, this is a large selection of calculators, with basic chemistry, basic stoichiometry, basic geometry, and a lot of
other things.

This probably isn't any good.

This project is split into two main 'versions':
    
    1. the multi-file version, consisting of 31 files, labelled 'polyphonic' in its respective folder
    
    2. the single-file version, having only one file, labelled 'monophonic' in its respective folder
The program itself is comprised of geometry, chemistry, basic conversions, and one item in a 'physics' section
    
This is a CLI tool, meaning it runs directly in the terminal.

This uses a Scanner for input and a Switch case on a (int) variable to facilitate a menu, and is wrapped in a do-while loop with a confirmation message.

***Compiling and Running the Project***

uses JDK 25, and rule switches

- Clone the repo
  - run 'git clone https://github.com/Alias-Missing/USYC'
- Compile the project
  - cd into either of the versions
  - run 'javac *.java'
  - run 'java  App.java' on Polyphonic version
    - run 'java aaaaa.java' on Monophonic version

***CHANGELOG***
- Consolidated classes:
     - GetMenuChoice
     - PrintMenu
- Added the 'Periodically' lookup table in the Polyphonic version of USYC
     - This is a molar-mass lookup table
     - This replaces most of the 'Please enter the molar mass' prompts, with a 'Please enter the atomic number of an element' prompt
- Added the 'Compound' Object in the Polyphonic version of USYC
    - This uses the Periodically lookup table to calculate molar mass
    - This replaces the 'Please enter the molar mass' prompts with a 'please enter the atomic number of element x' prompt
