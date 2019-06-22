package dubbo;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Robot {

	void say(String name);
}
