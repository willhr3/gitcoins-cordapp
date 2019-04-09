package com.gitcoins.schema

import net.corda.core.schemas.MappedSchema
import java.io.Serializable
import javax.persistence.*

object GitUserMappingSchema

object GitUserMappingSchemaV1 : MappedSchema (
        schemaFamily = GitUserMappingSchema.javaClass,
        version = 1,
        mappedTypes = listOf(GitUserKeys::class.java)) {

    @Entity
    @Table(name="GUK")
    class GitUserKeys(
            @Column(name="git_user_name", nullable = false)
            var gitUserName: String,

            @Column(name="user_key", nullable = false)
            var userKey: ByteArray
    ) : Serializable {
        constructor(): this("", ByteArray(1))
    }
}