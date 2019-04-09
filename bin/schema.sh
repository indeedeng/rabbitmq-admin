#! /bin/bash
##############################################################################
# Convert the JSON schema definitions into POJOs.
##############################################################################

cd "$(dirname "$0")/.."

package=com.indeed.rabbitmq.admin.pojo

jsonschema2pojo \
    --source src/schema \
    --target src/java \
    --package ${package} \
    --annotation-style JACKSON2 \
    --source-type JSONSCHEMA \
    --generate-builders \
    --long-integers

for file in "src/main/java/$(echo ${package} | tr '.' '/')"/*.java
do
    out="$(dirname "${file}")/$(basename "${file}" .java).$$.java"
    sed -e 's/[ \t]$//' $file > "${out}"
    mv -f "${out}" "${file}"
    echo "generated ${file}" 1>&2
done

for file in "src/main/java/$(echo ${package} | tr '.' '/')"/*.java
do
    parent="src/test$(dirname "${file#src/main}")"
    mkdir -p "${parent}"
    className="$(basename "${file}" .java)"
    target="${parent}/${className}Test.java"
    cat <<EOF > "${target}"
package ${package};

import org.junit.Test;

import java.beans.IntrospectionException;

import static java.util.Collections.singletonMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class ${className}Test {
    @Test
    public void testToString() {
        assertNotNull(new ${className}().toString());
    }

    @Test
    public void testAdditionalProperty_set() {
        final ${className} instance = new ${className}();
        instance.setAdditionalProperty("unit", "test");
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }

    @Test
    public void testAdditionalProperty_with() {
        final ${className} instance = new ${className}();
        assertSame(instance, instance.withAdditionalProperty("unit", "test"));
        assertEquals(singletonMap("unit", "test"), instance.getAdditionalProperties());
    }
}
EOF
    echo "generated ${target}" 1>&2
done

exit $?
