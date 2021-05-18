package com.osjager.importbean.importselect;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过 @Import 的 ImportSelector 类实现组件的导入（导入组件的 id 为全类名路径）
 *
 * @Author isjager
 */
public class OsageImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 导入组件的 id 为全类名路径
		return new String[] {"com.osjager.importbean.component.Dog"};
	}
}
