USYC
   
Name: Alejandro Rodriguez

Date Repo. made: 2026-05-28, yyyy-mm-dd @ 1:27 PM
    
This project is split into two main 'versions':
    
    1. the multi-file version, consisting of 31 files, labelled 'polyphonic' in its respective folder
    
    2. the single-file version, having only one file, labelled 'monophonic' in its respective folder
The program itself is comprised of geometry, chemistry, basic conversions, and one item in a 'physics' section
    
This is a CLI tool, meaning it runs directly in the terminal.

This uses a Scanner for input and a Switch case on a (int) variable to facilitate a menu, and is wrapped in a do-while loop with a confirmation message.

The Monophonic version currently ~~doesn't~~ **does** work. ~~I'll get~~ **I got** on that.

***CHANGELOG***
- Consolidated classes:
     - GetMenuChoice
     - PrintMenu
- Added the 'Periodically' lookup table in the Polyphonic version of USYC
     - This is a molar-mass lookup table
     - This replaces most of the 'Please enter the molar mass' prompts, ~~except in the stoichiometry section~~ with a 'Please enter the atomic number of an element' prompt
- Added the 'Compound' Object in the Polyphonic version of USYC
    - This uses the Periodically lookup table to calculate molar mass
    - This replaces the 'Please enter the molar mass' prompts with a 'please enter the atomic number of element x' prompt
