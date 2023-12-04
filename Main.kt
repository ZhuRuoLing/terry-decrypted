//Author: ZhuRuoLing

import java.io.File
import java.util.regex.Pattern
import kotlin.io.path.deleteIfExists

data class Component(val tags:Map<String,String>, val order: List<String>)

val patternLine = Pattern.compile("%wtf1:wtf2=%\"(tag[A-Z])%uGlP%(.+)\"")
val orderLine = Pattern.compile("(%tag[A-Z]%)+")

fun main() {
    val components = mutableListOf<Component>()

    File("wdnmd.bat").reader().use { reader ->
        var valueMap = mutableMapOf<String,String>()
        reader.forEachLine {
            //println(it)
            if (it.isEmpty())return@forEachLine
            val matcherPat = patternLine.matcher(it)
            if (matcherPat.matches()){
                val tagName = matcherPat.group(1)
                val value = matcherPat.group(2)
                println("$tagName = $value")
                valueMap += tagName to value
                return@forEachLine
            }
            if (orderLine.matcher(it).matches()){
                val order = it.split("%tag").dropWhile { s -> s.isEmpty() }.map {s -> s.replace("%","") }
                println(order)
                if (order.isNotEmpty()){
                    components += Component(valueMap, order)
                    valueMap = mutableMapOf()
                }
            }
        }
    }
    println("=========================")
    File("out.bat").apply {
        toPath().deleteIfExists()
        createNewFile()
        writer().use {
            components.forEach { c ->
                val s = buildString {
                    c.order.forEach {
                        append(c.tags["tag$it"])
                    }
                }
                println(s)
                it.appendLine(s)
            }
        }
    }
    println("=========================")
}