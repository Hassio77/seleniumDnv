# seleniumDnv
DNV technical test

In this repository you will find a Maven project in which I will use TestNG framework with Selenium to make a couple of automated tests.

The automated tests are:

  -Header menu navigation: The test consists in moving the mouse over the header menu and cheking that the elements of each item are being shown
  
  -Header navigation to Insights-Maritime: The test consists in navigating using the header menu to other page space (Insights/Maritime), waiting the driver loads, then asserting that URL is the one expected and an element of the page ("Maritime" header title) is being displayed
  
  
  --------------------------------------------------------------------------------------------------------
  

I will also use this readme to list other tests that I would do to the website in a bullet list:

-Sign in to Veracity starting from home page (with language check in Veracity login page)

-Veracity user register (also with language check) 

-"Global" drop down redirects to propper pages and in all of them "Global DNVGL" is shown (Checking this manually I found what I think it is an undesired behaviour, if the user clicks on "Global"
  and after that he tries to do actions on the header menu, the "Global" drop down doesn't collapse and the header menu doesn't work as expected, it collapses
  when moving the mouse from the menu item that we want to inspect to a sub-menu item)

-Home page search and advanced search test (cheking also the several links to other pages) in all the search elements 

-Footer links to social networks, about us, contact and legal information

-Veracity home page component and "visit Veracity data platform" link

-News and events ("View All" in Global News and Events, Media Contacts and Key Reports links works propperly) and header links to home page and about us

-"About us" video and main DNVGL location image are displayed propperly. Links to "Our History", "Key Figures", "Careers" and "Veracity Data Platform"
