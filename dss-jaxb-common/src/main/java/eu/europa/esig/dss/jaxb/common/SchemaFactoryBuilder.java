/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 * 
 * This file is part of the "DSS - Digital Signature Services" project.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.jaxb.common;

import javax.xml.XMLConstants;
import javax.xml.transform.TransformerFactory;
import javax.xml.validation.SchemaFactory;

/**
 * Builds a {@code SchemaFactory}
 */
public class SchemaFactoryBuilder extends AbstractFactoryBuilder<SchemaFactory> {
	
	private String schemaLanguage = XMLConstants.W3C_XML_SCHEMA_NS_URI;
	
	private SchemaFactoryBuilder() {
		enableFeature(XMLConstants.FEATURE_SECURE_PROCESSING);
		setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
		setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
	}
	
	/**
	 * Instantiates a pre-configured with security features {@code SchemaFactoryBuilder}
	 * 
	 * @return default {@link SchemaFactoryBuilder}
	 */
	public static SchemaFactoryBuilder getSecureSchemaBuilder() {
		return new SchemaFactoryBuilder();
	}
	
	/**
	 * Builds the configured {@code TransformerFactory}
	 * 
	 * @return {@link TransformerFactory}
	 */
	public SchemaFactory build() {
		SchemaFactory sf = SchemaFactory.newInstance(schemaLanguage);
		setSecurityFeatures(sf);
		setSecurityAttributes(sf);
		return sf;
	}
	
	/**
	 * Sets a schemaLanguage to instantiate {@code SchemaFactory} with
	 * 
	 * @param schemaLanguage {@link String} defined the schema language to use
	 */
	public void setSchemaLanguage(String schemaLanguage) {
		this.schemaLanguage = schemaLanguage;
	}
	
	@Override
	public SchemaFactoryBuilder enableFeature(String feature) {
		return (SchemaFactoryBuilder) super.enableFeature(feature);
	}
	
	@Override
	public SchemaFactoryBuilder disableFeature(String feature) {
		return (SchemaFactoryBuilder) super.disableFeature(feature);
	}
	
	@Override
	public SchemaFactoryBuilder setAttribute(String attribute, Object value) {
		return (SchemaFactoryBuilder) super.setAttribute(attribute, value);
	}
	
	@Override
	public SchemaFactoryBuilder removeAttribute(String attribute) {
		return (SchemaFactoryBuilder) super.removeAttribute(attribute);
	}

	@Override
	protected void setSecurityFeature(SchemaFactory factory, String feature, Boolean value) throws Exception {
		factory.setFeature(feature, value);
	}

	@Override
	protected void setSecurityAttribute(SchemaFactory factory, String attribute, Object value) throws Exception {
		factory.setProperty(attribute, value);
	}

}
