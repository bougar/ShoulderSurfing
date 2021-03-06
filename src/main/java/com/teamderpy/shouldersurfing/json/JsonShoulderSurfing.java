package com.teamderpy.shouldersurfing.json;

public class JsonShoulderSurfing
{
	private JsonVersions[] versions;
	
	public static class JsonVersions
	{
		private String version;
		private JsonMappings mappings;
		
		public static class JsonMappings
		{
			private JsonMapping[] classes;
			private JsonMapping[] methods;
			private JsonMapping[] fields;
			
			public static class JsonMapping
			{
				private String name;
				private String obf;
				private String desc;

				private String pkg;
				private String path;
				
				public String getClassPackage(boolean obfuscated)
				{
					return obfuscated ? this.obf : this.pkg;
				}
				
				public String getClassPath(boolean obfuscated)
				{
					return obfuscated ? this.obf : this.path;
				}
				
				public String getFieldOrMethod(boolean obfuscated)
				{
					return obfuscated ? this.obf : this.name;
				}
				
				public String getPackage()
				{
					return pkg;
				}
				
				public String getPath()
				{
					return path;
				}
				
				public String getName()
				{
					return name;
				}
				
				public String getObf()
				{
					return obf;
				}
				
				public String getDescriptor()
				{
					return desc;
				}
			}
			
			public JsonMapping[] getClasses()
			{
				return classes;
			}

			public JsonMapping[] getMethods()
			{
				return methods;
			}
			
			public JsonMapping[] getFields()
			{
				return fields;
			}
		}
		
		public String getVersion()
		{
			return version;
		}

		public JsonMappings getMappings()
		{
			return mappings;
		}
	}

	public JsonVersions[] getVersions()
	{
		return versions;
	}
}
