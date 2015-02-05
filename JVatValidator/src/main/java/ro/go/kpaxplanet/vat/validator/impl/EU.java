/*******************************************************************************
 * Copyright 2015 Eugen Covaci
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ro.go.kpaxplanet.vat.validator.impl;


public class EU extends AbstractVatFormalValidator  {

	@Override
	public boolean validateDigits(String vatNumber) {
		// We know little about EU numbers apart from the fact that the first 3
		// digits represent the
		// country, and that there are nine digits in total.
		return true;
	}

	@Override
	public String[] getRegexArray() {
		return new String[]{"^(\\d{9})$"};
	}

}