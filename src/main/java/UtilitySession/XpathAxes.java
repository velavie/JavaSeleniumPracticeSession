package UtilitySession;

public class XpathAxes {

	public static void main(String[] args) {

		// parent to direct child: /
		// //form/div/input

		// parent to direct + indirect child: //
		// //select[@id='Form_getForm_Country']//option

		// Child to Parent: Backward transversing: /.. takes back to direct parent
		// //input[@id='input-email']/../../../../../.. OR
		// //input[@id='input-email']/parent::div/parent::form

		// //input[@id='input-email']/ancestor::body --jumps to any mentioned
		// grandparent OR
		// //input[@id='input-email']/ancestor::form/ancestor::body/ancestor::html

		// //a[text()='Recurring payments']/ancestor::aside
		// //a[text()='Recurring payments']/ancestor::div

		// SIblings:
		// //a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		// --preceding sibling
		// //a[text()='Recurring payments']/following-sibling::a[text()='Returns'] --
		// following sibling where text = 'Returns'

		// //a[text()='Recurring payments']/following-sibling::a -- all following
		// sibling with tagname a -driver.findelements
		// (//a[text()='Recurring payments']/following-sibling::a)[2] --index number of
		// following-siblings
		// (//a[text()='Recurring payments']/following-sibling::a)[last()] --the last of
		// following-siblings

		// //input[@id='input-email']/preceding-sibling::label //starting from input
		// //label[text()='E-Mail Address']/following-sibling::input //starting from
		// label

		// Taken from - http://www.selectorshub.com/xpath-practice-page
		// //a[text()='Joe.Root']//ancestor::tr/td/input[@type='oheckbox']--a
		// //a[text()='Joe.Root']//ancestor::tr//input[@type='oheckbox'] --b - best
		// option
		// //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='oheckbox']
		// --c

	}

}
