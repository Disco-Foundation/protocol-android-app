package disco.foundation.discoprotocol.api

sealed class RequestResult<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : RequestResult<T>(data)
    class Error<T>(message: String?, data: T? = null) : RequestResult<T>(data, message)
    class Loading<T> : RequestResult<T>()
}

enum class RequestStatus {
    SUCCESS,
    ERROR,
    LOADING,
    NOTHING
}