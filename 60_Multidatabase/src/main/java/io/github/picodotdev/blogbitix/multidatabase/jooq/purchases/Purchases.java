/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.multidatabase.jooq.purchases;


import io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.Purchase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Purchases extends SchemaImpl {

	private static final long serialVersionUID = 1458521555;

	/**
	 * The reference instance of <code>PURCHASES</code>
	 */
	public static final Purchases PURCHASES = new Purchases();

	/**
	 * No further instances allowed
	 */
	private Purchases() {
		super("PURCHASES");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.SYSTEM_SEQUENCE_9404142C_B377_4B38_98D1_CB52F95283F2);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Purchase.PURCHASE);
	}
}
