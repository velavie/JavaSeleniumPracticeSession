package UtilitySession;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		// xpath: address of the element in the DOM
		// XML path
		// 1. Absolute xpath: Risky - can break as a div can be added - DO NOT USE

		// 2. relative xpat(custom xpath)

		// CUSTOM XPATH:

		// 1: Using Single attr:
		// tagname[@attrname='value']
		// input[@id='input-email']
		// input[@name='email']
		// input[@name] --1/5 - findElements
		// input[@value='Login'] 1/1

		// 2. using multiple attr
		// tagname[@attr1='value' and @attr2='value' and @attr3='value']
		// input[@value='Login' and @type='submit'] --- 1/1

		// input[@type='submit'] --- if 1/3, those option with more attributes that
		// returns 1/1
		// input[@type='text' or @type='email'] --1/4
		// input[@type and @value='Login'] OR - w/o supplying value of 1 @ --1/1
		// input[@type and @value] -- 1/6
		//// a[@href] --//All links on a page with href

		// 3. text():
		// h2[text()] //find all Header texts 'h2' - 1/2
		// tagname[text()='value']
		// h2[text()='New Customer'] -- 1/1
		// a[text()='Register'] --1/2
		// a[text()='Desktops'] --1/1

		// 4. text() and attributes
		// tagname[@attr='value' and text()'value']
		// a[@class = 'dropdown-toggle' and text()='Desktops'] --1/1
		// a[@class = 'dropdown-toggle' and text()='Desktops' and
		// @data-toggle="dropdown"] //any sequence

		// 5. contains() with attr
		// tag[contains(@attrName, 'value')]
		// input[contains(@placeholder, 'E-Mail')] --1/1
		// input[contains(@placeholder, 'Address')] - --1/1

		// tagname[contains(@attr, 'value') and @attr='value']
		// input[contains(@placeholder, 'Address') and @id='input-email']
		// input[contains(@placeholder, 'Address') and @name='email' and contains(@id,
		// 'input') ]
		// a[contains(@href, 'wishlist')] --1/3

		// dynamic ids: changes on each refresh
		// input id=firstname_123/>
		// input id=firstname_332/>
		// input id=firstname_584/>
		// input id=firstname_788/>
		// input[contains(@id, 'firstname_')] -- best xpath option to handle the dynamic
		// example above

		// 6. contains() with text()
		// tagname[contains(text(), 'value'
		// a[contains(text(), 'points')] --1/4
		// a[contains(text(), 'reward points in the dome')] --1/1

		// 7. contains() with text() and attr
		// tagname[contains(text(), 'value' and contains(@attr, 'value']
		// a[contains(text(), 'Notebooks') and contains(@href, 'category')]

		// a[contains(text(), 'Notebooks') and contains(@href, 'category') and
		// @attr2='value']

		// 8. starts-with
		// tagname[starts-with(@attr, 'value')]
		// input[starts-with(@placeholder, 'E-Mail')]

		// 9. starts-with() with text()
		// tagname[starts-with(text(), 'value')]
		// a[starts-with(text(), 'Forgotten')]

		// dynamic ids:
		// input id=firstname_123_login/>
		// input id=123firstname_login/>

		// 10. ends-with is not supported in xpath

		// 11. Index based xpath
		// (//a[@class='list-group-item'])[13] -- AVOID - index on page can change -
		// Except is index # will never change
		// (//a[text()='Forgotten Password'])[1] --[1] is the index number
		// (//input[@class='form-control'])[6] OR () = Capture Group
		// (//input[@class='form-control'])[position()=6]
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]

		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]

		// ((//div[@class='navFooterLinkCol
		// navAccessibility'])[last()]//a)[last()-last()+1]

		By fgt_pwd = By.xpath("(//a[text()='Forgotten Password'])[2]"); // example

		// //* --All elements on the page: Try to avoid as it may take time to parse all
		// elements on page
		// //*[@id] -- All element that have id attribute
		// //*[@class='form-control'] --All element that have class = form-control on
		// the page
		// //input[@class='form-control'] --All element with input as tagname and class
		// = form-control on the page
		// //*[@href] --will be more
		// //a[@href]

		// //label[normalize-space()='No'] -- To take care of spaces before or after
		// 'No' - Text attribute ONLY

	}

}
