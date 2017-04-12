package evolution;

import java.util.Collection;

import org.apache.commons.collections4.CollectionUtils;

public class Col {
	@SuppressWarnings("rawtypes")
	public static <T extends Collection> Boolean isEmpty(T t) {
		return CollectionUtils.isEmpty(t);
	}
}
