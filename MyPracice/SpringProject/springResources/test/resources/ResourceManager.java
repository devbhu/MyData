package test.resources;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class ResourceManager implements ResourceLoaderAware{

	ResourceLoader loader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		this.loader = resourceLoader;
		
	}
    
	public ResourceLoader getResourceLoader(){
		
		return loader;
	}
	
    
	
	

}
