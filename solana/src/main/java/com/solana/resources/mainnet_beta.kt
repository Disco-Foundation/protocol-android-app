package com.solana.resources

val mainnet_beta = """
    {
      "name": "Solana Token List",
      "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
      "keywords": [
        "solana",
        "spl"
      ],
      "tags": {
        "stablecoin": {
          "name": "stablecoin",
          "description": "Tokens that are fixed to an external asset, e.g. the US dollar"
        },
        "ethereum": {
          "name": "ethereum",
          "description": "Asset bridged from ethereum"
        },
        "lp-token": {
          "name": "lp-token",
          "description": "Asset representing liquidity provider token"
        },
        "wrapped-sollet": {
          "name": "wrapped-sollet",
          "description": "Asset wrapped using sollet bridge"
        },
        "wrapped": {
          "name": "wrapped",
          "description": "Asset wrapped using wormhole bridge"
        },
        "leveraged": {
          "name": "leveraged",
          "description": "Leveraged asset"
        },
        "bull": {
          "name": "bull",
          "description": "Leveraged Bull asset"
        },
        "bear": {
          "name": "bear",
          "description": "Leveraged Bear asset"
        },
        "nft": {
          "name": "nft",
          "description": "Non-fungible token"
        }
      },
      "timestamp": "2021-03-03T19:57:21+0000",
      "tokens": [
        {
          "chainId": 101,
          "address": "So11111111111111111111111111111111111111112",
          "symbol": "SOL",
          "name": "Wrapped SOL",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://solana.com/"
          }
        },
        {
          "chainId": 101,
          "address": "EPjFWdd5AufqSSqeM2qN1xzybapC8G4wEGGkZwyTDt1v",
          "symbol": "USDC",
          "name": "USD Coin",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48/logo.png",
          "tags": [
            "stablecoin"
          ],
          "extensions": {
            "website": "https://www.centre.io/"
          }
        },
        {
          "chainId": 101,
          "address": "9n4nbM75f5Ui33ZbPYXn59EwSgE8CGsHtAeTH5YFeJ9E",
          "symbol": "BTC",
          "name": "Wrapped Bitcoin (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/bitcoin/info/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "2FPyTwcZLUg1MDrwsyoP4D6s1tM7hAkHYRjkNb5w6Pxk",
          "symbol": "ETH",
          "name": "Wrapped Ethereum (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "3JSf5tPeuscJGtaCp5giEiDhv51gQ4v3zWg8DGgyLfAB",
          "symbol": "YFI",
          "name": "Wrapped YFI (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0bc529c00C6401aEF6D220BE8C6Ea1667F6Ad93e/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "CWE8jPTUYhdCTZYWPTe1o5DFqfdjzWKc9WKz6rSjQUdG",
          "symbol": "LINK",
          "name": "Wrapped Chainlink (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x514910771AF9Ca656af840dff83E8264EcF986CA/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "Ga2AXHpfAF6mv2ekZwcsJFqu7wB4NV331qNH7fW9Nst8",
          "symbol": "XRP",
          "name": "Wrapped XRP (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ripple/info/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "BQcdHdAQW1hczDbBi9hiegXAR7A98Q9jx3X3iBBBDiq4",
          "symbol": "wUSDT",
          "name": "Wrapped USDT (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/explorer/public/tokens/usdt.svg",
          "tags": [
            "stablecoin",
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "AR1Mtgh7zAtxuxGd2XPovXPVjcSdY3i4rQYisNadjfKy",
          "symbol": "SUSHI",
          "name": "Wrapped SUSHI (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6B3595068778DD592e39A122f4f5a5cF09C90fE2/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "website": "https://www.sushi.com",
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "CsZ5LZkDS7h9TDKjrbL7VAwQZ9nsRu8vJLhRYfmGaN8K",
          "symbol": "ALEPH",
          "name": "Wrapped ALEPH (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/nuls/assets/NULSd6HgyZkiqLnBzTaeSQfx1TNg2cqbzq51h/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "SF3oTvfWzEP3DTwGSvUXRrGTvr75pdZNnBLAH9bzMuX",
          "symbol": "SXP",
          "name": "Wrapped SXP (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets/blockchains/ethereum/assets/0x8CE9137d39326AD0cD6491fb5CC0CbA0e089b6A9/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "BtZQfWqDGbk9Wf2rXEiWyQBdBY1etnUUn6zEphvVS7yN",
          "symbol": "HGET",
          "name": "Wrapped Hedget (Sollet)",
          "decimals": 6,
          "logoURI": "https://www.hedget.com/images/favicon.svg",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "website": "https://www.hedget.com/",
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "5Fu5UUgbjpUvdBveb3a1JTNirL8rXtiYeSMWvKjtUNQv",
          "symbol": "CREAM",
          "name": "Wrapped Cream Finance (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/smartchain/assets/0xd4CB328A82bDf5f03eB737f37Fa6B370aef3e888/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "873KLxCbz7s9Kc4ZzgYRtNmhfkQrhfyWGZJBmyCbC3ei",
          "symbol": "UBXT",
          "name": "Wrapped Upbots (Sollet)",
          "decimals": 6,
          "logoURI": "https://assets.coingecko.com/coins/images/12476/small/UBXT.png?1600132967",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "website": "https://upbots.com/",
            "explorer": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "HqB7uswoVg4suaQiDP3wjxob1G5WdZ144zhdStwMCq7e",
          "symbol": "HNT",
          "name": "Wrapped Helium (Sollet)",
          "decimals": 6,
          "logoURI": "https://assets.coingecko.com/coins/images/4284/small/Helium_HNT.png?1612620071",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "9S4t2NEAiJVMvPdRYKVrfJpBafPBLtvbvyS3DecojQHw",
          "symbol": "FRONT",
          "name": "Wrapped FRONT (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xf8C3527CC04340b208C854E985240c02F7B7793f/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "6WNVCuxCGJzNjmMZoKyhZJwvJ5tYpsLyAtagzYASqBoF",
          "symbol": "AKRO",
          "name": "Wrapped AKRO (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xb2734a4Cec32C81FDE26B0024Ad3ceB8C9b34037/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "DJafV9qemGp7mLMEn5wrfqaFwxsbLgUsGVS16zKRk9kc",
          "symbol": "HXRO",
          "name": "Wrapped HXRO (Sollet)",
          "decimals": 6,
          "logoURI": "https://assets.coingecko.com/coins/images/7805/large/hxro-squarelogo-1585089594129.png?1586221980",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "DEhAasscXF4kEGxFgJ3bq4PpVGp5wyUxMRvn6TzGVHaw",
          "symbol": "UNI",
          "name": "Wrapped UNI (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1f9840a85d5aF5bf1D1762F925BDADdC4201F984/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt",
          "symbol": "SRM",
          "name": "Serum",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x476c5E26a75bd202a9683ffD34359C0CC15be0fF/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://projectserum.com/"
          }
        },
        {
          "chainId": 101,
          "address": "AGFEad2et2ZJif9jaGpdMixQqvW5i81aBdvKe7PHNfz3",
          "symbol": "FTT",
          "name": "Wrapped FTT (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/AGFEad2et2ZJif9jaGpdMixQqvW5i81aBdvKe7PHNfz3/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a",
            "assetContract": "https://etherscan.io/address/0x50d1c9771902476076ecfc8b2a83ad6b9355a4c9"
          }
        },
        {
          "chainId": 101,
          "address": "MSRMcoVyrFxnSgo5uXwone5SKcGhT1KEJMFEkMEWf9L",
          "symbol": "MSRM",
          "name": "MegaSerum",
          "decimals": 0,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x476c5E26a75bd202a9683ffD34359C0CC15be0fF/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://projectserum.com/"
          }
        },
        {
          "chainId": 101,
          "address": "BXXkv6z8ykpG1yuvUDPgh732wzVHB69RnB9YgSYh3itW",
          "symbol": "WUSDC",
          "name": "Wrapped USDC (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48/logo.png",
          "tags": [
            "stablecoin",
            "wrapped-sollet",
            "ethereum"
          ]
        },
        {
          "chainId": 101,
          "address": "GXMvfY2jpQctDqZ9RoU3oWPhufKiCcFEfchvYumtX7jd",
          "symbol": "TOMO",
          "name": "Wrapped TOMO (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/tomochain/info/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "EcqExpGNFBve2i1cMJUTR4bPXj4ZoqmDD2rTkeCcaTFX",
          "symbol": "KARMA",
          "name": "Wrapped KARMA (Sollet)",
          "decimals": 4,
          "logoURI": "https://cdn.jsdelivr.net/gh/machi-x/assets@master/blockchains/ethereum/assets/0xdfe691f37b6264a90ff507eb359c45d55037951c/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "EqWCKXfs3x47uVosDpTRgFniThL9Y8iCztJaapxbEaVX",
          "symbol": "LUA",
          "name": "Wrapped LUA (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xB1f66997A5760428D3a87D68b90BfE0aE64121cC/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "GeDS162t9yGJuLEHPWXXGrb1zwkzinCgRwnT8vHYjKza",
          "symbol": "MATH",
          "name": "Wrapped MATH (Sollet)",
          "decimals": 6,
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "GUohe4DJUA5FKPWo3joiPgsB7yzer7LpDmt1Vhzy3Zht",
          "symbol": "KEEP",
          "name": "Wrapped KEEP (Sollet)",
          "decimals": 6,
          "logoURI": "https://assets.coingecko.com/coins/images/3373/large/IuNzUb5b_400x400.jpg?1589526336",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "9F9fNTT6qwjsu4X4yWYKZpsbw5qT7o6yR2i57JF2jagy",
          "symbol": "SWAG",
          "name": "Wrapped SWAG (Sollet)",
          "decimals": 6,
          "logoURI": "https://assets.coingecko.com/coins/images/12805/large/photo_2020-10-14_23.17.02.jpeg?1602688642",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "DgHK9mfhMtUwwv54GChRrU54T2Em5cuszq2uMuen1ZVE",
          "symbol": "CEL",
          "name": "Wrapped Celsius (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xaaAEBE6Fe48E54f431b0C390CfaF0b017d09D42d/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "7ncCLJpP3MNww17LW8bRvx8odQQnubNtfNZBL5BgAEHW",
          "symbol": "RSR",
          "name": "Wrapped Reserve Rights (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8762db106B2c2A0bccB3A80d1Ed41273552616E8/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "5wihEYGca7X4gSe97C5mVcqNsfxBzhdTwpv72HKs25US",
          "symbol": "1INCH",
          "name": "Wrapped 1INCH (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x111111111117dC0aa78b770fA6A738034120C302/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "38i2NQxjp5rt5B3KogqrxmBxgrAwaB3W1f1GmiKqh9MS",
          "symbol": "GRT",
          "name": "Wrapped GRT  (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xc944E90C64B2c07662A292be6244BDf05Cda44a7/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "Avz2fmevhhu87WYtWQCFj9UjKRjF9Z9QWwN2ih9yF95G",
          "symbol": "COMP",
          "name": "Wrapped Compound (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xc00e94Cb662C3520282E6f5717214004A7f26888/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "9wRD14AhdZ3qV8et3eBQVsrb3UoBZDUbJGyFckpTg8sj",
          "symbol": "PAXG",
          "name": "Wrapped Paxos Gold (Sollet)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x45804880De22913dAFE09f4980848ECE6EcbAf78/logo.png",
          "tags": [
            "wrapped-sollet",
            "ethereum"
          ],
          "extensions": {
            "bridgeContract": "https://etherscan.io/address/0xeae57ce9cc1984f202e15e038b964bb8bdf7229a"
          }
        },
        {
          "chainId": 101,
          "address": "EchesyfXePKdLtoiZSL8pBe8Myagyy8ZRqsACNCFGnvp",
          "symbol": "FIDA",
          "name": "Bonfida",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/dr497/awesome-serum-markets/icons/fida.svg",
          "tags": [],
          "extensions": {
            "website": "https://bonfida.com/"
          }
        },
        {
          "chainId": 101,
          "address": "kinXdEcpDQeHPEuQnqmUgtYykqKGVFq6CeVX5iAHJq6",
          "symbol": "KIN",
          "name": "KIN",
          "decimals": 5,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/kin/info/logo.png",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "MAPS41MDahZ9QdKXhVa4dWB9RuyfV4XqhyAZ8XcYepb",
          "symbol": "MAPS",
          "name": "MAPS",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/explorer/public/tokens/maps.svg",
          "tags": [],
          "extensions": {
            "website": "https://maps.me/"
          }
        },
        {
          "chainId": 101,
          "address": "z3dn17yLaGMKffVogeFHQ9zWVcXgqgf3PQnDsNs2g6M",
          "symbol": "OXY",
          "name": "Oxygen Protocol",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/nathanielparke/awesome-serum-markets/icons/oxy.svg",
          "tags": [],
          "extensions": {
            "website": "https://www.oxygen.org/"
          }
        },
        {
          "chainId": 101,
          "address": "FtgGSFADXBtroxq8VCausXRr2of47QBf5AS1NtZCu4GD",
          "symbol": "BRZ",
          "name": "BRZ",
          "decimals": 4,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/explorer/public/tokens/brz.png",
          "tags": [],
          "extensions": {
            "website": "https://brztoken.io/"
          }
        },
        {
          "chainId": 101,
          "address": "Es9vMFrzaCERmJfrF4H2FYD4KCoNkY11McCe8BenwNYB",
          "symbol": "USDT",
          "name": "USDT",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/explorer/public/tokens/usdt.svg",
          "tags": [
            "stablecoin"
          ],
          "extensions": {
            "website": "https://tether.to/"
          }
        },
        {
          "chainId": 101,
          "address": "2oDxYGgTBmST4rc3yn1YtcSEck7ReDZ8wHWLqZAuNWXH",
          "symbol": "xMARK",
          "name": "Standard",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/2oDxYGgTBmST4rc3yn1YtcSEck7ReDZ8wHWLqZAuNWXH/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "website": "https://benchmarkprotocol.finance/",
            "address": "0x36b679bd64ed73dbfd88909cdcb892cb66bd4cbb",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x36b679bd64ed73dbfd88909cdcb892cb66bd4cbb"
          }
        },
        {
          "chainId": 101,
          "address": "4k3Dyjzvzp8eMZWUXbBCjEvwSkkk59S5iCNLY3QrkX6R",
          "symbol": "RAY",
          "name": "Raydium",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "CzPDyvotTcxNqtPne32yUiEVQ6jk42HZi1Y3hUu7qf7f",
          "symbol": "RAY-WUSDT",
          "name": "Raydium Legacy LP Token V2 (RAY-WUSDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "134Cct3CSdRCbYgq5SkwmHgfwjJ7EM5cG9PzqffWqECx",
          "symbol": "RAY-SOL",
          "name": "Raydium LP Token V2 (RAY-SOL)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "EVDmwajM5U73PD34bYPugwiA4Eqqbrej4mLXXv15Z5qR",
          "symbol": "LINK-WUSDT",
          "name": "Raydium LP Token V2 (LINK-WUSDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "KY4XvwHy7JPzbWYAbk23jQvEb4qWJ8aCqYWREmk1Q7K",
          "symbol": "ETH-WUSDT",
          "name": "Raydium LP Token V2 (ETH-WUSDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "FgmBnsF5Qrnv8X9bomQfEtQTQjNNiBCWRKGpzPnE5BDg",
          "symbol": "RAY-USDC",
          "name": "Raydium Legacy LP Token V2 (RAY-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "5QXBMXuCL7zfAk39jEVVEvcrz1AvBGgT9wAhLLHLyyUJ",
          "symbol": "RAY-SRM",
          "name": "Raydium Legacy LP Token V2 (RAY-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "FdhKXYjCou2jQfgKWcNY7jb8F2DPLU1teTTTRfLBD2v1",
          "symbol": "RAY-WUSDT",
          "name": "Raydium Legacy LP Token V3 (RAY-WUSDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "BZFGfXMrjG2sS7QT2eiCDEevPFnkYYF7kzJpWfYxPbcx",
          "symbol": "RAY-USDC",
          "name": "Raydium LP Token V3 (RAY-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "DSX5E21RE9FB9hM8Nh8xcXQfPK6SzRaJiywemHBSsfup",
          "symbol": "RAY-SRM",
          "name": "Raydium LP Token V3 (RAY-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "F5PPQHGcznZ2FxD9JaxJMXaf7XkaFFJ6zzTBcW8osQjw",
          "symbol": "RAY-SOL",
          "name": "Raydium LP Token V3 (RAY-SOL)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "8Q6MKy5Yxb9vG1mWzppMtMb2nrhNuCRNUkJTeiE3fuwD",
          "symbol": "RAY-ETH",
          "name": "Raydium LP Token V3 (RAY-ETH)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "DsBuznXRTmzvEdb36Dx3aVLVo1XmH7r1PRZUFugLPTFv",
          "symbol": "FIDA-RAY",
          "name": "Raydium Fusion LP Token V4 (FIDA-RAY)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "FwaX9W7iThTZH5MFeasxdLpxTVxRcM7ZHieTCnYog8Yb",
          "symbol": "OXY-RAY",
          "name": "Raydium Fusion LP Token V4 (OXY-RAY)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "CcKK8srfVdTSsFGV3VLBb2YDbzF4T4NM2C3UEjC39RLP",
          "symbol": "MAPS-RAY",
          "name": "Raydium Fusion LP Token V4 (MAPS-RAY)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "CHT8sft3h3gpLYbCcZ9o27mT5s3Z6VifBVbUiDvprHPW",
          "symbol": "KIN-RAY",
          "name": "Raydium Legacy Fusion LP Token V4 (KIN-RAY)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "C3sT1R3nsw4AVdepvLTLKr5Gvszr7jufyBWUCvy4TUvT",
          "symbol": "RAY-USDT",
          "name": "Raydium LP Token V4 (RAY-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "8HoQnePLqPj4M7PUDzfw8e3Ymdwgc7NLGnaTUapubyvu",
          "symbol": "SOL-USDC",
          "name": "Raydium LP Token V4 (SOL-USDC)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "865j7iMmRRycSYUXzJ33ZcvLiX9JHvaLidasCyUyKaRE",
          "symbol": "YFI-USDC",
          "name": "Raydium LP Token V4 (YFI-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "9XnZd82j34KxNLgQfz29jGbYdxsYznTWRpvZE3SRE7JG",
          "symbol": "SRM-USDC",
          "name": "Raydium LP Token V4 (SRM-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "75dCoKfUHLUuZ4qEh46ovsxfgWhB4icc3SintzWRedT9",
          "symbol": "FTT-USDC",
          "name": "Raydium LP Token V4 (FTT-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "2hMdRdVWZqetQsaHG8kQjdZinEMBz75vsoWTCob1ijXu",
          "symbol": "BTC-USDC",
          "name": "Raydium LP Token V4 (BTC-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "2QVjeR9d2PbSf8em8NE8zWd8RYHjFtucDUdDgdbDD2h2",
          "symbol": "SUSHI-USDC",
          "name": "Raydium LP Token V4 (SUSHI-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "CHyUpQFeW456zcr5XEh4RZiibH8Dzocs6Wbgz9aWpXnQ",
          "symbol": "TOMO-USDC",
          "name": "Raydium LP Token V4 (TOMO-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "BqjoYjqKrXtfBKXeaWeAT5sYCy7wsAYf3XjgDWsHSBRs",
          "symbol": "LINK-USDC",
          "name": "Raydium LP Token V4 (LINK-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "13PoKid6cZop4sj2GfoBeujnGfthUbTERdE5tpLCDLEY",
          "symbol": "ETH-USDC",
          "name": "Raydium LP Token V4 (ETH-USDC)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "2Vyyeuyd15Gp8aH6uKE72c4hxc8TVSLibxDP9vzspQWG",
          "symbol": "COPE-USDC",
          "name": "Raydium Fusion LP Token V4 (COPE-USDC)",
          "decimals": 0,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "Epm4KfTj4DMrvqn6Bwg2Tr2N8vhQuNbuK8bESFp4k33K",
          "symbol": "SOL-USDT",
          "name": "Raydium LP Token V4 (SOL-USDT)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "FA1i7fej1pAbQbnY8NbyYUsTrWcasTyipKreDgy1Mgku",
          "symbol": "YFI-USDT",
          "name": "Raydium LP Token V4 (YFI-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "HYSAu42BFejBS77jZAZdNAWa3iVcbSRJSzp3wtqCbWwv",
          "symbol": "SRM-USDT",
          "name": "Raydium LP Token V4 (SRM-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "2cTCiUnect5Lap2sk19xLby7aajNDYseFhC9Pigou11z",
          "symbol": "FTT-USDT",
          "name": "Raydium LP Token V4 (FTT-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "DgGuvR9GSHimopo3Gc7gfkbKamLKrdyzWkq5yqA6LqYS",
          "symbol": "BTC-USDT",
          "name": "Raydium LP Token V4 (BTC-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "Ba26poEYDy6P2o95AJUsewXgZ8DM9BCsmnU9hmC9i4Ki",
          "symbol": "SUSHI-USDT",
          "name": "Raydium LP Token V4 (SUSHI-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "D3iGro1vn6PWJXo9QAPj3dfta6dKkHHnmiiym2EfsAmi",
          "symbol": "TOMO-USDT",
          "name": "Raydium LP Token V4 (TOMO-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "Dr12Sgt9gkY8WU5tRkgZf1TkVWJbvjYuPAhR3aDCwiiX",
          "symbol": "LINK-USDT",
          "name": "Raydium LP Token V4 (LINK-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "nPrB78ETY8661fUgohpuVusNCZnedYCgghzRJzxWnVb",
          "symbol": "ETH-USDT",
          "name": "Raydium LP Token V4 (ETH-USDT)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "EGJht91R7dKpCj8wzALkjmNdUUUcQgodqWCYweyKcRcV",
          "symbol": "YFI-SRM",
          "name": "Raydium LP Token V4 (YFI-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "AsDuPg9MgPtt3jfoyctUCUgsvwqAN6RZPftqoeiPDefM",
          "symbol": "FTT-SRM",
          "name": "Raydium LP Token V4 (FTT-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "AGHQxXb3GSzeiLTcLtXMS2D5GGDZxsB2fZYZxSB5weqB",
          "symbol": "BTC-SRM",
          "name": "Raydium LP Token V4 (BTC-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "3HYhUnUdV67j1vn8fu7ExuVGy5dJozHEyWvqEstDbWwE",
          "symbol": "SUSHI-SRM",
          "name": "Raydium LP Token V4 (SUSHI-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "GgH9RnKrQpaMQeqmdbMvs5oo1A24hERQ9wuY2pSkeG7x",
          "symbol": "TOMO-SRM",
          "name": "Raydium LP Token V4 (TOMO-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "GXN6yJv12o18skTmJXaeFXZVY1iqR18CHsmCT8VVCmDD",
          "symbol": "LINK-SRM",
          "name": "Raydium LP Token V4 (LINK-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "9VoY3VERETuc2FoadMSYYizF26mJinY514ZpEzkHMtwG",
          "symbol": "ETH-SRM",
          "name": "Raydium LP Token V4 (ETH-SRM)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "AKJHspCwDhABucCxNLXUSfEzb7Ny62RqFtC9uNjJi4fq",
          "symbol": "SRM-SOL",
          "name": "Raydium LP Token V4 (SRM-SOL)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [
            "lp-token"
          ],
          "extensions": {
            "website": "https://raydium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "AcstFzGGawvvdVhYV9bftr7fmBHbePUjhv53YK1W3dZo",
          "symbol": "LSD",
          "name": "LSD",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "91fSFQsPzMLat9DHwLdQacW3i3EGnWds5tA5mt7yLiT9",
          "symbol": "Unlimited Energy",
          "name": "Unlimited Energy",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "29PEpZeuqWf9tS2gwCjpeXNdXLkaZSMR2s1ibkvGsfnP",
          "symbol": "Need for Speed",
          "name": "Need for Speed",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "HsY8PNar8VExU335ZRYzg89fX7qa4upYu6vPMPFyCDdK",
          "symbol": "ADOR OPENS",
          "name": "ADOR OPENS",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "EDP8TpLJ77M3KiDgFkZW4v4mhmKJHZi9gehYXenfFZuL",
          "symbol": "CMS - Rare",
          "name": "CMS - Rare",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "BrUKFwAABkExb1xzYU4NkRWzjBihVQdZ3PBz4m5S8if3",
          "symbol": "Tesla",
          "name": "Tesla",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "9CmQwpvVXRyixjiE3LrbSyyopPZohNDN1RZiTk8rnXsQ",
          "symbol": "DeceFi",
          "name": "DeceFi",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "F6ST1wWkx2PeH45sKmRxo1boyuzzWCfpnvyKL4BGeLxF",
          "symbol": "Power User",
          "name": "Power User",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "dZytJ7iPDcCu9mKe3srL7bpUeaR3zzkcVqbtqsmxtXZ",
          "symbol": "VIP Member",
          "name": "VIP Member",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "8T4vXgwZUWwsbCDiptHFHjdfexvLG9UP8oy1psJWEQdS",
          "symbol": "Uni Christmas",
          "name": "Uni Christmas",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "EjFGGJSyp9UDS8aqafET5LX49nsG326MeNezYzpiwgpQ",
          "symbol": "BNB",
          "name": "BNB",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "FkmkTr4en8CXkfo9jAwEMov6PVNLpYMzWr3Udqf9so8Z",
          "symbol": "Seldom",
          "name": "Seldom",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "2gn1PJdMAU92SU5inLSp4Xp16ZC5iLF6ScEi7UBvp8ZD",
          "symbol": "Satoshi Closeup",
          "name": "Satoshi Closeup",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "7mhZHtPL4GFkquQR4Y6h34Q8hNkQvGc1FaNtyE43NvUR",
          "symbol": "Satoshi GB",
          "name": "Satoshi GB",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "8RoKfLx5RCscbtVh8kYb81TF7ngFJ38RPomXtUREKsT2",
          "symbol": "Satoshi OG",
          "name": "Satoshi OG",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "9rw5hyDngBQ3yDsCRHqgzGHERpU2zaLh1BXBUjree48J",
          "symbol": "Satoshi BTC",
          "name": "Satoshi BTC",
          "decimals": 10,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "AiD7J6D5Hny5DJB1MrYBc2ePQqy2Yh4NoxWwYfR7PzxH",
          "symbol": "Satoshi GB",
          "name": "Satoshi GB",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "4qzEcYvT6TuJME2EMZ5vjaLvQja6R4hKjarA73WQUwt6",
          "name": "APESZN_HOODIE",
          "symbol": "APESZN_HOODIE",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "APhyVWtzjdTVYhyta9ngSiCDk2pLi8eEZKsHGSbsmwv6",
          "name": "APESZN_TEE_SHIRT",
          "symbol": "APESZN_TEE_SHIRT",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "bxiA13fpU1utDmYuUvxvyMT8odew5FEm96MRv7ij3eb",
          "symbol": "Satoshi",
          "name": "Satoshi",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "GoC24kpj6TkvjzspXrjSJC2CVb5zMWhLyRcHJh9yKjRF",
          "symbol": "Satoshi Closeup",
          "name": "Satoshi Closeup",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "oCUduD44ETuZ65bpWdPzPDSnAdreg1sJrugfwyFZVHV",
          "symbol": "Satoshi BTC",
          "name": "Satoshi BTC",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "9Vvre2DxBB9onibwYDHeMsY1cj6BDKtEDccBPWRN215E",
          "symbol": "Satoshi Nakamoto",
          "name": "Satoshi Nakamoto",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "7RpFk44cMTAUt9CcjEMWnZMypE9bYQsjBiSNLn5qBvhP",
          "symbol": "Charles Hoskinson",
          "name": "Charles Hoskinson",
          "decimals": 9,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "GyRkPAxpd9XrMHcBF6fYHVRSZQvQBwAGKAGQeBPSKzMq",
          "symbol": "SBF",
          "name": "SBF",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "AgdBQN2Sy2abiZ2KToWeUsQ9PHdCv95wt6kVWRf5zDkx",
          "symbol": "Bitcoin Tram",
          "name": "Bitcoin Tram",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "7TRzvCqXN8KSXggbSyeEG2Z9YBBhEFmbtmv6FLbd4mmd",
          "symbol": "SRM tee-shirt",
          "name": "SRM tee-shirt",
          "decimals": 0,
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://solible.com/"
          }
        },
        {
          "chainId": 101,
          "address": "gksYzxitEf2HyE7Bb81vvHXNH5f3wa43jvXf4TcUZwb",
          "symbol": "PERK",
          "name": "PERK",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/perkexchange/assets/logos/SPL-token/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://perk.exchange/"
          }
        },
        {
          "chainId": 101,
          "address": "BDxWSxkMLW1nJ3VggamUKkEKrtCaVqzFxoDApM8HdBks",
          "symbol": "BTSG",
          "name": "BitSong",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/bitsongofficial/assets/logo_128x128.png",
          "tags": [],
          "extensions": {
            "website": "https://bitsong.io/"
          }
        },
        {
          "chainId": 101,
          "address": "5ddiFxh3J2tcZHfn8uhGRYqu16P3FUvBfh8WoZPUHKW5",
          "name": "EOSBEAR",
          "symbol": "EOSBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "qxxF6S62hmZF5bo46mS7C2qbBa87qRossAM78VzsDqi",
          "name": "EOSBULL",
          "symbol": "EOSBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "2CDLbxeuqkLTLY3em6FFQgfBQV5LRnEsJJgcFCvWKNcS",
          "name": "BNBBEAR",
          "symbol": "BNBBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "AfjHjdLibuXyvmz7PyTSc5KEcGBh43Kcu8Sr2tyDaJyt",
          "name": "BNBBULL",
          "symbol": "BNBBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "8kA1WJKoLTxtACNPkvW6UNufsrpxUY57tXZ9KmG9123t",
          "name": "BSVBULL",
          "symbol": "BSVBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "2FGW8BVMu1EHsz2ZS9rZummDaq6o2DVrZZPw4KaAvDWh",
          "name": "BSVBEAR",
          "symbol": "BSVBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "8L9XGTMzcqS9p61zsR35t7qipwAXMYkD6disWoDFZiFT",
          "name": "LTCBEAR",
          "symbol": "LTCBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "863ZRjf1J8AaVuCqypAdm5ktVyGYDiBTvD1MNHKrwyjp",
          "name": "LTCBULL",
          "symbol": "LTCBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "GkSPaHdY2raetuYzsJYacHtrAtQUfWt64bpd1VzxJgSD",
          "name": "BULL",
          "symbol": "BULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "45vwTZSDFBiqCMRdtK4xiLCHEov8LJRW8GwnofG8HYyH",
          "name": "BEAR",
          "symbol": "BEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "2VTAVf1YCwamD3ALMdYHRMV5vPUCXdnatJH5f1khbmx6",
          "name": "BCHBEAR",
          "symbol": "BCHBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "22xoSp66BDt4x4Q5xqxjaSnirdEyharoBziSFChkLFLy",
          "name": "BCHBULL",
          "symbol": "BCHBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "CwChm6p9Q3yFrjzVeiLTTbsoJkooscof5SJYZc2CrNqG",
          "name": "ETHBULL",
          "symbol": "ETHBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "Bvv9xLodFrvDFSno9Ud8SEh5zVtBDQQjnBty2SgMcJ2s",
          "name": "ETHBEAR",
          "symbol": "ETHBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "HRhaNssoyv5tKFRcbPg69ULEbcD8DPv99GdXLcdkgc1A",
          "name": "ALTBULL",
          "symbol": "ALTBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "9Mu1KmjBKTUWgpDoeTJ5oD7XFQmEiZxzspEd3TZGkavx",
          "name": "ALTBEAR",
          "symbol": "ALTBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "AYL1adismZ1U9pTuN33ahG4aYc5XTZQL4vKFx9ofsGWD",
          "name": "BULLSHIT",
          "symbol": "BULLSHIT",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "5jqymuoXXVcUuJKrf1MWiHSqHyg2osMaJGVy69NsJWyP",
          "name": "BEARSHIT",
          "symbol": "BEARSHIT",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "EL1aDTnLKjf4SaGpqtxJPyK94imSBr8fWDbcXjXQrsmj",
          "name": "MIDBULL",
          "symbol": "MIDBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "2EPvVjHusU3ozoucmdhhnqv3HQtBsQmjTnSa87K91HkC",
          "name": "MIDBEAR",
          "symbol": "MIDBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "8TCfJTyeqNBZqyDMY4VwDY7kdCCY7pcbJJ58CnKHkMu2",
          "name": "LINKBEAR",
          "symbol": "LINKBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "EsUoZMbACNMppdqdmuLCFLet8VXxt2h47N9jHCKwyaPz",
          "name": "LINKBULL",
          "symbol": "LINKBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "262cQHT3soHwzuo2oVSy5kAfHcFZ1Jjn8C1GRLcQNKA3",
          "name": "XRPBULL",
          "symbol": "XRPBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "8sxtSswmQ7Lcd2GjK6am37Z61wJZjA2SzE7Luf7yaKBB",
          "name": "XRPBEAR",
          "symbol": "XRPBEAR",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bear"
          ]
        },
        {
          "chainId": 101,
          "address": "4pk3pf9nJDN1im1kNwWJN1ThjE8pCYCTexXYGyFjqKVf",
          "name": "ODOP",
          "symbol": "ODOP",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "91z91RukFM16hyEUCXuwMQwp2BW3vanNG5Jh5yj6auiJ",
          "name": "BVOL",
          "symbol": "BVOL",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "5TY71D29Cyuk9UrsSxLXw2quJBpS7xDDFuFu2K9W7Wf9",
          "name": "IBVOL",
          "symbol": "IBVOL",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "dK83wTVypEpa1pqiBbHY3MNuUnT3ADUZM4wk9VZXZEc",
          "name": "Wrapped Aave",
          "symbol": "AAVE",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7Fc66500c84A76Ad7e9c93437bFc5Ac33E2DDaE9/logo.png",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "A6aY2ceogBz1VaXBxm1j2eJuNZMRqrWUAnKecrMH85zj",
          "name": "LQID",
          "symbol": "LQID",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/dr497/awesome-serum-markets/icons/lqid.svg",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "7CnFGR9mZWyAtWxPcVuTewpyC3A3MDW4nLsu5NY6PDbd",
          "name": "SECO",
          "symbol": "SECO",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "3GECTP7H4Tww3w8jEPJCJtXUtXxiZty31S9szs84CcwQ",
          "name": "HOLY",
          "symbol": "HOLY",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "6ry4WBDvAwAnrYJVv6MCog4J8zx6S3cPgSqnTsDZ73AR",
          "name": "TRYB",
          "symbol": "TRYB",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "ASboaJPFtJeCS5eG4gL3Lg95xrTz2UZSLE9sdJtY93kE",
          "name": "DOGEBULL",
          "symbol": "DOGEBULL",
          "decimals": 6,
          "logoURI": "",
          "tags": [
            "leveraged",
            "bull"
          ]
        },
        {
          "chainId": 101,
          "address": "Gnhy3boBT4MA8TTjGip5ND2uNsceh1Wgeaw1rYJo51ZY",
          "symbol": "MAPSPOOL",
          "name": "Bonfida Maps Pool",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/explorer/public/tokens/maps.svg",
          "tags": [],
          "extensions": {
            "website": "https://bonfida.com/"
          }
        },
        {
          "chainId": 101,
          "address": "9iDWyYZ5VHBCxxmWZogoY3Z6FSbKsX4WFe37c728krdT",
          "symbol": "OXYPOOL",
          "name": "Bonfida Oxy Pool",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/nathanielparke/awesome-serum-markets/icons/oxy.svg",
          "tags": [],
          "extensions": {
            "website": "https://bonfida.com/"
          }
        },
        {
          "chainId": 101,
          "address": "D68NB5JkzvyNCZAvi6EGtEcGvSoRNPanU9heYTAUFFRa",
          "name": "PERP",
          "symbol": "PERP",
          "decimals": 6,
          "logoURI": "",
          "tags": []
        },
        {
          "chainId": 101,
          "address": "93a1L7xaEV7vZGzNXCcb9ztZedbpKgUiTHYxmFKJwKvc",
          "symbol": "RAYPOOL",
          "name": "Bonfida Ray Pool",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/RVKd61ztZW9GUwhRbbLoYVRE5Xf1B2tVscKqwZqXgEr/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://bonfida.com/"
          }
        },
        {
          "chainId": 101,
          "address": "FeGn77dhg1KXRRFeSwwMiykZnZPw5JXW6naf2aQgZDQf",
          "symbol": "wWETH",
          "name": "Wrapped Ether (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2"
          }
        },
        {
          "chainId": 101,
          "address": "AbLwQCyU9S8ycJgu8wn6woRCHSYJmjMpJFcAHQ6vjq2P",
          "symbol": "wTUSD",
          "name": "TrueUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0000000000085d4780B73119b644AE5ecd22b376/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0000000000085d4780B73119b644AE5ecd22b376",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0000000000085d4780B73119b644AE5ecd22b376"
          }
        },
        {
          "chainId": 101,
          "address": "3JfuyCg5891hCX1ZTbvt3pkiaww3XwgyqQH6E9eHtqKD",
          "symbol": "wLON",
          "name": "Tokenlon (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0000000000095413afC295d19EDeb1Ad7B71c952/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0000000000095413afC295d19EDeb1Ad7B71c952",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0000000000095413afC295d19EDeb1Ad7B71c952"
          }
        },
        {
          "chainId": 101,
          "address": "6k7mrqiAqEWnABVN8FhfuNUrmrnaMh44nNWydNXctbpV",
          "symbol": "wALBT",
          "name": "AllianceBlock Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x00a8b738E453fFd858a7edf03bcCfe20412f0Eb0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x00a8b738E453fFd858a7edf03bcCfe20412f0Eb0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x00a8b738E453fFd858a7edf03bcCfe20412f0Eb0"
          }
        },
        {
          "chainId": 101,
          "address": "4b166BQEQunjg8oNTDcLeWU3nidQnVTL1Vni8ANU7Mvt",
          "symbol": "wSKL",
          "name": "SKALE (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x00c83aeCC790e8a4453e5dD3B0B4b3680501a7A7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x00c83aeCC790e8a4453e5dD3B0B4b3680501a7A7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x00c83aeCC790e8a4453e5dD3B0B4b3680501a7A7"
          }
        },
        {
          "chainId": 101,
          "address": "CcHhpEx9VcWx7UBJC8DJaR5h3wNdexsQtB1nEfekjSHn",
          "symbol": "wUFT",
          "name": "UniLend Finance Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0202Be363B8a4820f3F4DE7FaF5224fF05943AB1/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0202Be363B8a4820f3F4DE7FaF5224fF05943AB1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0202Be363B8a4820f3F4DE7FaF5224fF05943AB1"
          }
        },
        {
          "chainId": 101,
          "address": "VPjCJkR1uZGT9k9q7PsLArS5sEQtWgij8eZC8tysCy7",
          "symbol": "wORN",
          "name": "Orion Protocol (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0258F474786DdFd37ABCE6df6BBb1Dd5dfC4434a/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0258F474786DdFd37ABCE6df6BBb1Dd5dfC4434a",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0258F474786DdFd37ABCE6df6BBb1Dd5dfC4434a"
          }
        },
        {
          "chainId": 101,
          "address": "CxzHZtzrm6bAz6iFCAGgCYCd3iQb5guUD7oQXKxdgk5c",
          "symbol": "wSRK",
          "name": "SparkPoint (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0488401c3F535193Fa8Df029d9fFe615A06E74E6/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0488401c3F535193Fa8Df029d9fFe615A06E74E6",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0488401c3F535193Fa8Df029d9fFe615A06E74E6"
          }
        },
        {
          "chainId": 101,
          "address": "FqMZWvmii4NNzhLBKGzkvGj3e3XTxNVDNSKDJnt9fVQV",
          "symbol": "wUMA",
          "name": "UMA Voting Token v1 (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x04Fa0d235C4abf4BcF4787aF4CF447DE572eF828/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x04Fa0d235C4abf4BcF4787aF4CF447DE572eF828",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x04Fa0d235C4abf4BcF4787aF4CF447DE572eF828"
          }
        },
        {
          "chainId": 101,
          "address": "6GGNzF99kCG1ozQbP7M7EYW9zPbQGPMwTCCi2Dqx3qhU",
          "symbol": "wSkey",
          "name": "SmartKey (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x06A01a4d579479Dd5D884EBf61A31727A3d8D442/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x06A01a4d579479Dd5D884EBf61A31727A3d8D442",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x06A01a4d579479Dd5D884EBf61A31727A3d8D442"
          }
        },
        {
          "chainId": 101,
          "address": "Gc9rR2dUHfuYCJ8rU1Ye9fr8JoZZt9ZrfmXitQRLsxRW",
          "symbol": "wMIR",
          "name": "Wrapped MIR Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x09a3EcAFa817268f77BE1283176B946C4ff2E608/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x09a3EcAFa817268f77BE1283176B946C4ff2E608",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x09a3EcAFa817268f77BE1283176B946C4ff2E608"
          }
        },
        {
          "chainId": 101,
          "address": "B8xDqdrHpYLNHQKQ4ARDKurxhkhn2gfZa8WRosCEzXnF",
          "symbol": "wGRO",
          "name": "Growth (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x09e64c2B61a5f1690Ee6fbeD9baf5D6990F8dFd0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x09e64c2B61a5f1690Ee6fbeD9baf5D6990F8dFd0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x09e64c2B61a5f1690Ee6fbeD9baf5D6990F8dFd0"
          }
        },
        {
          "chainId": 101,
          "address": "GE1X8ef7fcsJ93THx4CvV7BQsdEyEAyk61s2L5YfSXiL",
          "symbol": "wSTAKE",
          "name": "xDai (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0Ae055097C6d159879521C384F1D2123D1f195e6/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0Ae055097C6d159879521C384F1D2123D1f195e6",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0Ae055097C6d159879521C384F1D2123D1f195e6"
          }
        },
        {
          "chainId": 101,
          "address": "7TK6QeyTsnTT6KsnK2tHHfh62mbjNuFWoyUc8vo3CmmU",
          "symbol": "wYFI",
          "name": "yearn.finance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0bc529c00C6401aEF6D220BE8C6Ea1667F6Ad93e/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0bc529c00C6401aEF6D220BE8C6Ea1667F6Ad93e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0bc529c00C6401aEF6D220BE8C6Ea1667F6Ad93e"
          }
        },
        {
          "chainId": 101,
          "address": "CTtKth9uW7froBA6xCd2MP7BXjGFESdT1SyxUmbHovSw",
          "symbol": "wBAT",
          "name": "Basic Attention Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0D8775F648430679A709E98d2b0Cb6250d2887EF/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0D8775F648430679A709E98d2b0Cb6250d2887EF",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0D8775F648430679A709E98d2b0Cb6250d2887EF"
          }
        },
        {
          "chainId": 101,
          "address": "DrL2D4qCRCeNkQz3AJikLjBc3cS6fqqcQ3W7T9vbshCu",
          "symbol": "wMANA",
          "name": "Decentraland MANA (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0F5D2fB29fb7d3CFeE444a200298f468908cC942/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0F5D2fB29fb7d3CFeE444a200298f468908cC942",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0F5D2fB29fb7d3CFeE444a200298f468908cC942"
          }
        },
        {
          "chainId": 101,
          "address": "3cJKTW69FQDDCud7AhKHXZg126b3t73a2qVcVBS1BWjL",
          "symbol": "wXIO",
          "name": "XIO Network (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0f7F961648aE6Db43C75663aC7E5414Eb79b5704/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0f7F961648aE6Db43C75663aC7E5414Eb79b5704",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0f7F961648aE6Db43C75663aC7E5414Eb79b5704"
          }
        },
        {
          "chainId": 101,
          "address": "CQivbzuRQLvZbqefKc5gLzhSzZzAaySAdMmTG7pFn41w",
          "symbol": "wLAYER",
          "name": "Unilayer (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x0fF6ffcFDa92c53F615a4A75D982f399C989366b/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x0fF6ffcFDa92c53F615a4A75D982f399C989366b",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x0fF6ffcFDa92c53F615a4A75D982f399C989366b"
          }
        },
        {
          "chainId": 101,
          "address": "C1LpKYrkVvWF5imsQ7JqJSZHj9NXNmJ5tEHkGTtLVH2L",
          "symbol": "wUMX",
          "name": "https://unimex.network/ (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x10Be9a8dAe441d276a5027936c3aADEd2d82bC15/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x10Be9a8dAe441d276a5027936c3aADEd2d82bC15",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x10Be9a8dAe441d276a5027936c3aADEd2d82bC15"
          }
        },
        {
          "chainId": 101,
          "address": "8F3kZd9XEpFgNZ4fZnEAC5CJZLewnkNE8QCjdvorGWuW",
          "symbol": "w1INCH",
          "name": "1INCH Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x111111111117dC0aa78b770fA6A738034120C302/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x111111111117dC0aa78b770fA6A738034120C302",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x111111111117dC0aa78b770fA6A738034120C302"
          }
        },
        {
          "chainId": 101,
          "address": "H3UMboX4tnjba1Xw1a2VhUtkdgnrbmPvmDm6jaouQDN9",
          "symbol": "wARMOR",
          "name": "Armor (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1337DEF16F9B486fAEd0293eb623Dc8395dFE46a/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1337DEF16F9B486fAEd0293eb623Dc8395dFE46a",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1337DEF16F9B486fAEd0293eb623Dc8395dFE46a"
          }
        },
        {
          "chainId": 101,
          "address": "Cw26Yz3rAN42mM5WpKriuGvbXnvRYmFA9sbBWH49KyqL",
          "symbol": "warNXM",
          "name": "Armor NXM (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1337DEF18C680aF1f9f45cBcab6309562975b1dD/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1337DEF18C680aF1f9f45cBcab6309562975b1dD",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1337DEF18C680aF1f9f45cBcab6309562975b1dD"
          }
        },
        {
          "chainId": 101,
          "address": "3GVAecXsFP8xLFuAMMpg5NU4g5JK6h2NZWsQJ45wiw6b",
          "symbol": "wDPI",
          "name": "DefiPulse Index (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1494CA1F11D487c2bBe4543E90080AeBa4BA3C2b/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1494CA1F11D487c2bBe4543E90080AeBa4BA3C2b",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1494CA1F11D487c2bBe4543E90080AeBa4BA3C2b"
          }
        },
        {
          "chainId": 101,
          "address": "AC4BK5yoEKn5hw6WpH3iWu56pEwigQdR48CiiqJ3R1pd",
          "symbol": "wDHC",
          "name": "DeltaHub Community (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x152687Bc4A7FCC89049cF119F9ac3e5aCF2eE7ef/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x152687Bc4A7FCC89049cF119F9ac3e5aCF2eE7ef",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x152687Bc4A7FCC89049cF119F9ac3e5aCF2eE7ef"
          }
        },
        {
          "chainId": 101,
          "address": "7bXgNP7SEwrqbnfLBPgKDRKSGjVe7cjbuioRP23upF5H",
          "symbol": "wKEX",
          "name": "KIRA Network (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x16980b3B4a3f9D89E33311B5aa8f80303E5ca4F8/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x16980b3B4a3f9D89E33311B5aa8f80303E5ca4F8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x16980b3B4a3f9D89E33311B5aa8f80303E5ca4F8"
          }
        },
        {
          "chainId": 101,
          "address": "5uC8Gj96sK6UG44AYLpbX3DUjKtBUxBrhHcM8JDtyYum",
          "symbol": "wEWTB",
          "name": "Energy Web Token Bridged (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x178c820f862B14f316509ec36b13123DA19A6054/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x178c820f862B14f316509ec36b13123DA19A6054",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x178c820f862B14f316509ec36b13123DA19A6054"
          }
        },
        {
          "chainId": 101,
          "address": "EzeRaHuh1Xu1nDUypv1VWXcGsNJ71ncCJ8HeWuyg8atJ",
          "symbol": "wCC10",
          "name": "Cryptocurrency Top 10 Tokens Index (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x17aC188e09A7890a1844E5E65471fE8b0CcFadF3/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x17aC188e09A7890a1844E5E65471fE8b0CcFadF3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x17aC188e09A7890a1844E5E65471fE8b0CcFadF3"
          }
        },
        {
          "chainId": 101,
          "address": "CYzPVv1zB9RH6hRWRKprFoepdD8Y7Q5HefCqrybvetja",
          "symbol": "wAUDIO",
          "name": "Audius (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x18aAA7115705e8be94bfFEBDE57Af9BFc265B998/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x18aAA7115705e8be94bfFEBDE57Af9BFc265B998",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x18aAA7115705e8be94bfFEBDE57Af9BFc265B998"
          }
        },
        {
          "chainId": 101,
          "address": "9yPmJNUp1qFV6LafdYdegZ8sCgC4oy6Rgt9WsDJqv3EX",
          "symbol": "wREP",
          "name": "Reputation (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1985365e9f78359a9B6AD760e32412f4a445E862/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1985365e9f78359a9B6AD760e32412f4a445E862",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1985365e9f78359a9B6AD760e32412f4a445E862"
          }
        },
        {
          "chainId": 101,
          "address": "CZxP1KtsfvMXZTGKR1fNwNChv8hGAfQrgVoENabN8zKU",
          "symbol": "wVSP",
          "name": "VesperToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1b40183EFB4Dd766f11bDa7A7c3AD8982e998421/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1b40183EFB4Dd766f11bDa7A7c3AD8982e998421",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1b40183EFB4Dd766f11bDa7A7c3AD8982e998421"
          }
        },
        {
          "chainId": 101,
          "address": "8cGPyDGT1mgG1iWzNjPmCDKSK9veJhoBAguq7rp7CjTe",
          "symbol": "wKP3R",
          "name": "Keep3rV1 (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1cEB5cB57C4D4E2b2433641b95Dd330A33185A44/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1cEB5cB57C4D4E2b2433641b95Dd330A33185A44",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1cEB5cB57C4D4E2b2433641b95Dd330A33185A44"
          }
        },
        {
          "chainId": 101,
          "address": "DGghbWvncPL41U8TmUtXcGMgLeQqkaA2yM7UfcabftR8",
          "symbol": "wLEAD",
          "name": "Lead Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1dD80016e3d4ae146Ee2EBB484e8edD92dacC4ce/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1dD80016e3d4ae146Ee2EBB484e8edD92dacC4ce",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1dD80016e3d4ae146Ee2EBB484e8edD92dacC4ce"
          }
        },
        {
          "chainId": 101,
          "address": "3MVa4e32PaKmPxYUQ6n8vFkWtCma68Ld7e7fTktWDueQ",
          "symbol": "wUNI",
          "name": "Uniswap (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x1f9840a85d5aF5bf1D1762F925BDADdC4201F984/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1f9840a85d5aF5bf1D1762F925BDADdC4201F984",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1f9840a85d5aF5bf1D1762F925BDADdC4201F984"
          }
        },
        {
          "chainId": 101,
          "address": "qfnqNqs3nCAHjnyCgLRDbBtq4p2MtHZxw8YjSyYhPoL",
          "symbol": "wWBTC",
          "name": "Wrapped BTC (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x2260FAC5E5542a773Aa44fBCfeDf7C193bc2C599/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2260FAC5E5542a773Aa44fBCfeDf7C193bc2C599",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2260FAC5E5542a773Aa44fBCfeDf7C193bc2C599"
          }
        },
        {
          "chainId": 101,
          "address": "8My83RG8Xa1EhXdDKHWq8BWZN1zF3XUrWL3TXCLjVPFh",
          "symbol": "wUNN",
          "name": "UNION Protocol Governance Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x226f7b842E0F0120b7E194D05432b3fd14773a9D/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x226f7b842E0F0120b7E194D05432b3fd14773a9D",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x226f7b842E0F0120b7E194D05432b3fd14773a9D"
          }
        },
        {
          "chainId": 101,
          "address": "6jVuhLJ2mzyZ8DyUcrDj8Qr6Q9bqbJnq4fAnMeEduDM9",
          "symbol": "wSOCKS",
          "name": "Unisocks Edition 0 (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x23B608675a2B2fB1890d3ABBd85c5775c51691d5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x23B608675a2B2fB1890d3ABBd85c5775c51691d5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x23B608675a2B2fB1890d3ABBd85c5775c51691d5"
          }
        },
        {
          "chainId": 101,
          "address": "Az8PAQ7s6s5ZFgBiKKEizHt3SzDxXKZayDCtRZoC3452",
          "symbol": "wDEXT",
          "name": "DEXTools (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x26CE25148832C04f3d7F26F32478a9fe55197166/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x26CE25148832C04f3d7F26F32478a9fe55197166",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x26CE25148832C04f3d7F26F32478a9fe55197166"
          }
        },
        {
          "chainId": 101,
          "address": "ELSnGFd5XnSdYFFSgYQp7n89FEbDqxN4npuRLW4PPPLv",
          "symbol": "wHEX",
          "name": "HEX (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x2b591e99afE9f32eAA6214f7B7629768c40Eeb39/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2b591e99afE9f32eAA6214f7B7629768c40Eeb39",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2b591e99afE9f32eAA6214f7B7629768c40Eeb39"
          }
        },
        {
          "chainId": 101,
          "address": "9iwfHhE7BJKNo4Eb1wX3p4uyJjEN9RoGLt4BvMdzZoiN",
          "symbol": "wCREAM",
          "name": "Cream (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x2ba592F78dB6436527729929AAf6c908497cB200/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2ba592F78dB6436527729929AAf6c908497cB200",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2ba592F78dB6436527729929AAf6c908497cB200"
          }
        },
        {
          "chainId": 101,
          "address": "DdiXkfDGhLiKyw889QC4nmcxSwMqarLBtrDofPJyx7bt",
          "symbol": "wYFIM",
          "name": "yfi.mobi (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x2e2f3246b6c65CCc4239c9Ee556EC143a7E5DE2c/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2e2f3246b6c65CCc4239c9Ee556EC143a7E5DE2c",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2e2f3246b6c65CCc4239c9Ee556EC143a7E5DE2c"
          }
        },
        {
          "chainId": 101,
          "address": "6wdcYNvUyHCerSiGbChkvGBF6Qzju1YP5qpXRQ4tqdZ3",
          "symbol": "wZEE",
          "name": "ZeroSwapToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x2eDf094dB69d6Dcd487f1B3dB9febE2eeC0dd4c5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2eDf094dB69d6Dcd487f1B3dB9febE2eeC0dd4c5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2eDf094dB69d6Dcd487f1B3dB9febE2eeC0dd4c5"
          }
        },
        {
          "chainId": 101,
          "address": "4xh8iC54UgaNpY4h34rxfZBSc9L2fBB8gWcYtDGHjxhN",
          "symbol": "wwANATHA",
          "name": "Wrapped ANATHA (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x3383c5a8969Dc413bfdDc9656Eb80A1408E4bA20/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x3383c5a8969Dc413bfdDc9656Eb80A1408E4bA20",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x3383c5a8969Dc413bfdDc9656Eb80A1408E4bA20"
          }
        },
        {
          "chainId": 101,
          "address": "5Jq6S9HYqfG6TUMjjsKpnfis7utUAB69JiEGkkypdmgP",
          "symbol": "wRAMP",
          "name": "RAMP DEFI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x33D0568941C0C64ff7e0FB4fbA0B11BD37deEd9f/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x33D0568941C0C64ff7e0FB4fbA0B11BD37deEd9f",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x33D0568941C0C64ff7e0FB4fbA0B11BD37deEd9f"
          }
        },
        {
          "chainId": 101,
          "address": "6uMUH5ztnj6AKYvL71EZgcyyRxjyBC5LVkscA5LrBc3c",
          "symbol": "wPRQ",
          "name": "Parsiq Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x362bc847A3a9637d3af6624EeC853618a43ed7D2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x362bc847A3a9637d3af6624EeC853618a43ed7D2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x362bc847A3a9637d3af6624EeC853618a43ed7D2"
          }
        },
        {
          "chainId": 101,
          "address": "42gecM46tdSiYZN2CK1ek5raCxnzQf1xfhoKAf3F7Y5k",
          "symbol": "wSLP",
          "name": "Small Love Potion (Wormhole)",
          "decimals": 0,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x37236CD05b34Cc79d3715AF2383E96dd7443dCF1/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x37236CD05b34Cc79d3715AF2383E96dd7443dCF1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x37236CD05b34Cc79d3715AF2383E96dd7443dCF1"
          }
        },
        {
          "chainId": 101,
          "address": "F6M9DW1cWw7EtFK9m2ukvT9WEvtEbdZfTzZTtDeBcnAf",
          "symbol": "wSAND",
          "name": "SAND (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x3845badAde8e6dFF049820680d1F14bD3903a5d0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x3845badAde8e6dFF049820680d1F14bD3903a5d0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x3845badAde8e6dFF049820680d1F14bD3903a5d0"
          }
        },
        {
          "chainId": 101,
          "address": "G27M8w6G4hwatMNFi46DPAUR1YkxSmRNFKus7SgYLoDy",
          "symbol": "wCVP",
          "name": "Concentrated Voting Power (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x38e4adB44ef08F22F5B5b76A8f0c2d0dCbE7DcA1/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x38e4adB44ef08F22F5B5b76A8f0c2d0dCbE7DcA1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x38e4adB44ef08F22F5B5b76A8f0c2d0dCbE7DcA1"
          }
        },
        {
          "chainId": 101,
          "address": "FjucGZpcdVXaWJH21pbrGQaKNszsGsJqbAXu4sJywKJa",
          "symbol": "wREN",
          "name": "Republic Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x408e41876cCCDC0F92210600ef50372656052a38/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x408e41876cCCDC0F92210600ef50372656052a38",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x408e41876cCCDC0F92210600ef50372656052a38"
          }
        },
        {
          "chainId": 101,
          "address": "5kvugu18snfGRu1PykMfRzYfUxJYs3smk1PWQcGo6Z8a",
          "symbol": "wXOR",
          "name": "Sora (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x40FD72257597aA14C7231A7B1aaa29Fce868F677/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x40FD72257597aA14C7231A7B1aaa29Fce868F677",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x40FD72257597aA14C7231A7B1aaa29Fce868F677"
          }
        },
        {
          "chainId": 101,
          "address": "3EKQDmiXj8yLBFpZca4coxBpP8XJCzmjVgUdVydSmaaT",
          "symbol": "wFUN",
          "name": "FunFair (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x419D0d8BdD9aF5e606Ae2232ed285Aff190E711b/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x419D0d8BdD9aF5e606Ae2232ed285Aff190E711b",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x419D0d8BdD9aF5e606Ae2232ed285Aff190E711b"
          }
        },
        {
          "chainId": 101,
          "address": "6J9soByB65WUamsEG8KSPdphBV1oCoGvr5QpaUaY3r19",
          "symbol": "wPICKLE",
          "name": "PickleToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x429881672B9AE42b8EbA0E26cD9C73711b891Ca5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x429881672B9AE42b8EbA0E26cD9C73711b891Ca5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x429881672B9AE42b8EbA0E26cD9C73711b891Ca5"
          }
        },
        {
          "chainId": 101,
          "address": "HEsqFznmAERPUmMWHtDWYAZRoFbNHZpuNuFrPio68Zp1",
          "symbol": "wPAXG",
          "name": "Paxos Gold (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x45804880De22913dAFE09f4980848ECE6EcbAf78/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x45804880De22913dAFE09f4980848ECE6EcbAf78",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x45804880De22913dAFE09f4980848ECE6EcbAf78"
          }
        },
        {
          "chainId": 101,
          "address": "BrtLvpVCwVDH5Jpqjtiuhh8wKYA5b3NZCnsSftr61viv",
          "symbol": "wQNT",
          "name": "Quant (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4a220E6096B25EADb88358cb44068A3248254675/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4a220E6096B25EADb88358cb44068A3248254675",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4a220E6096B25EADb88358cb44068A3248254675"
          }
        },
        {
          "chainId": 101,
          "address": "8DRgurhcQPJeCqQEpbeYGUmwAz2tETbyWUYLUU4Q7goM",
          "symbol": "wORAI",
          "name": "Oraichain Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4c11249814f11b9346808179Cf06e71ac328c1b5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4c11249814f11b9346808179Cf06e71ac328c1b5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4c11249814f11b9346808179Cf06e71ac328c1b5"
          }
        },
        {
          "chainId": 101,
          "address": "4e5cqAsZ7wQqwLi7AApS9CgN8Yaho5TvkhvcLaGyiuzL",
          "symbol": "wTRU",
          "name": "TrustToken (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4C19596f5aAfF459fA38B0f7eD92F11AE6543784/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4C19596f5aAfF459fA38B0f7eD92F11AE6543784",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4C19596f5aAfF459fA38B0f7eD92F11AE6543784"
          }
        },
        {
          "chainId": 101,
          "address": "HkhBUKSct2V93Z35apDmXthkRvH4yvMovLyv8s8idDgP",
          "symbol": "wMCB",
          "name": "MCDEX Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4e352cF164E64ADCBad318C3a1e222E9EBa4Ce42/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4e352cF164E64ADCBad318C3a1e222E9EBa4Ce42",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4e352cF164E64ADCBad318C3a1e222E9EBa4Ce42"
          }
        },
        {
          "chainId": 101,
          "address": "Eof7wbYsHZKaoyUGwM7Nfkoo6zQW4U7uWXqz2hoQzSkK",
          "symbol": "wNU",
          "name": "NuCypher (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4fE83213D56308330EC302a8BD641f1d0113A4Cc/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4fE83213D56308330EC302a8BD641f1d0113A4Cc",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4fE83213D56308330EC302a8BD641f1d0113A4Cc"
          }
        },
        {
          "chainId": 101,
          "address": "5CmA1HTVZt5NRtwiUrqWrcnT5JRW5zHe6uQXfP7SDUNz",
          "symbol": "wRAZOR",
          "name": "RAZOR (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x50DE6856358Cc35f3A9a57eAAA34BD4cB707d2cd/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x50DE6856358Cc35f3A9a57eAAA34BD4cB707d2cd",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x50DE6856358Cc35f3A9a57eAAA34BD4cB707d2cd"
          }
        },
        {
          "chainId": 101,
          "address": "6msNYXzSVtjinqapq2xcvBb5NRq4YTPAi7wc5Jx8M8TS",
          "symbol": "wLINK",
          "name": "ChainLink Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x514910771AF9Ca656af840dff83E8264EcF986CA/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x514910771AF9Ca656af840dff83E8264EcF986CA",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x514910771AF9Ca656af840dff83E8264EcF986CA"
          }
        },
        {
          "chainId": 101,
          "address": "BX2gcRRS12iqFzKCpvTt4krBBYNymR9JBDZBxzfFLnbF",
          "symbol": "weRSDL",
          "name": "UnFederalReserveToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x5218E472cFCFE0b64A064F055B43b4cdC9EfD3A6/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x5218E472cFCFE0b64A064F055B43b4cdC9EfD3A6",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x5218E472cFCFE0b64A064F055B43b4cdC9EfD3A6"
          }
        },
        {
          "chainId": 101,
          "address": "CCGLdsokcybeF8NrCcu1RSQK8isNBjBA58kVEMTHTKjx",
          "symbol": "wsUSD",
          "name": "Synth sUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x57Ab1ec28D129707052df4dF418D58a2D46d5f51/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x57Ab1ec28D129707052df4dF418D58a2D46d5f51",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x57Ab1ec28D129707052df4dF418D58a2D46d5f51"
          }
        },
        {
          "chainId": 101,
          "address": "FP9ogG7hTdfcTJwn4prF9AVEcfcjLq1GtkqYM4oRn7eY",
          "symbol": "wHEGIC",
          "name": "Hegic (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x584bC13c7D411c00c01A62e8019472dE68768430/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x584bC13c7D411c00c01A62e8019472dE68768430",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x584bC13c7D411c00c01A62e8019472dE68768430"
          }
        },
        {
          "chainId": 101,
          "address": "DboP5vvYUVjmKSHKJ1YFHwmv41KtUscnYgzjmPgHwQVn",
          "symbol": "wXFI",
          "name": "Xfinance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x5BEfBB272290dD5b8521D4a938f6c4757742c430/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x5BEfBB272290dD5b8521D4a938f6c4757742c430",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x5BEfBB272290dD5b8521D4a938f6c4757742c430"
          }
        },
        {
          "chainId": 101,
          "address": "6c4U9yxGzVjejSJJXrdX8wtt532Et6MrBUZc2oK5j6w5",
          "symbol": "wDEXTF",
          "name": "DEXTF Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x5F64Ab1544D28732F0A24F4713c2C8ec0dA089f0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x5F64Ab1544D28732F0A24F4713c2C8ec0dA089f0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x5F64Ab1544D28732F0A24F4713c2C8ec0dA089f0"
          }
        },
        {
          "chainId": 101,
          "address": "JuXkRYNw54rujC7SPWcAM4ArLgA5x8nDQbS8xHAr6MA",
          "symbol": "wRLC",
          "name": "iExec RLC (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x607F4C5BB672230e8672085532f7e901544a7375/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x607F4C5BB672230e8672085532f7e901544a7375",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x607F4C5BB672230e8672085532f7e901544a7375"
          }
        },
        {
          "chainId": 101,
          "address": "7NfgSkv6kZ6ZWP6SJPtMuaUYGVEngVK8UFnaFTPk3QsM",
          "symbol": "wCORE",
          "name": "cVault.finance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x62359Ed7505Efc61FF1D56fEF82158CcaffA23D7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x62359Ed7505Efc61FF1D56fEF82158CcaffA23D7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x62359Ed7505Efc61FF1D56fEF82158CcaffA23D7"
          }
        },
        {
          "chainId": 101,
          "address": "AqLKDJiGL4wXKPAfzNom3xEdQwgj2LTCE4k34gzvZsE6",
          "symbol": "wCFi",
          "name": "CyberFi Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x63b4f3e3fa4e438698CE330e365E831F7cCD1eF4/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x63b4f3e3fa4e438698CE330e365E831F7cCD1eF4",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x63b4f3e3fa4e438698CE330e365E831F7cCD1eF4"
          }
        },
        {
          "chainId": 101,
          "address": "FLrjpCRrd4GffHu8MVYGvuLxYLuBGVaXsnCecw3Effci",
          "symbol": "wWISE",
          "name": "Wise Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x66a0f676479Cee1d7373f3DC2e2952778BfF5bd6/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x66a0f676479Cee1d7373f3DC2e2952778BfF5bd6",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x66a0f676479Cee1d7373f3DC2e2952778BfF5bd6"
          }
        },
        {
          "chainId": 101,
          "address": "GaMPhVyp1xd9xJuPskDEzQzp8mKfEjAmhny8NX7y7YKc",
          "symbol": "wGNO",
          "name": "Gnosis Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6810e776880C02933D47DB1b9fc05908e5386b96/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6810e776880C02933D47DB1b9fc05908e5386b96",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6810e776880C02933D47DB1b9fc05908e5386b96"
          }
        },
        {
          "chainId": 101,
          "address": "CCAQZHBVWKDukT68PZ3LenDs7apibeSYeJ3jHE8NzBC5",
          "symbol": "wPOOLZ",
          "name": "Poolz Finance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x69A95185ee2a045CDC4bCd1b1Df10710395e4e23/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x69A95185ee2a045CDC4bCd1b1Df10710395e4e23",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x69A95185ee2a045CDC4bCd1b1Df10710395e4e23"
          }
        },
        {
          "chainId": 101,
          "address": "FYpdBuyAHSbdaAyD1sKkxyLWbAP8uUW9h6uvdhK74ij1",
          "symbol": "wDAI",
          "name": "Dai Stablecoin (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6B175474E89094C44Da98b954EedeAC495271d0F/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6B175474E89094C44Da98b954EedeAC495271d0F",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6B175474E89094C44Da98b954EedeAC495271d0F"
          }
        },
        {
          "chainId": 101,
          "address": "HbMGwfGjGPchtaPwyrtJFy8APZN5w1hi63xnzmj1f23v",
          "symbol": "wSUSHI",
          "name": "SushiSwap (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6B3595068778DD592e39A122f4f5a5cF09C90fE2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6B3595068778DD592e39A122f4f5a5cF09C90fE2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6B3595068778DD592e39A122f4f5a5cF09C90fE2"
          }
        },
        {
          "chainId": 101,
          "address": "6Tmi8TZasqdxWB59uE5Zw9VLKecuCbsLSsPEqoMpmozA",
          "symbol": "wFYZ",
          "name": "Fyooz (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6BFf2fE249601ed0Db3a87424a2E923118BB0312/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6BFf2fE249601ed0Db3a87424a2E923118BB0312",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6BFf2fE249601ed0Db3a87424a2E923118BB0312"
          }
        },
        {
          "chainId": 101,
          "address": "3sHinPxEPqhEGip2Wy45TFmgAA1Atg2mctMjY5RKJUjk",
          "symbol": "wQRX",
          "name": "QuiverX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6e0daDE58D2d89eBBe7aFc384e3E4f15b70b14D8/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6e0daDE58D2d89eBBe7aFc384e3E4f15b70b14D8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6e0daDE58D2d89eBBe7aFc384e3E4f15b70b14D8"
          }
        },
        {
          "chainId": 101,
          "address": "4ighgEijHcCoLu9AsvwVz2TnGFqAgzQtQMr6ch88Jrfe",
          "symbol": "wTRADE",
          "name": "UniTrade (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6F87D756DAf0503d08Eb8993686c7Fc01Dc44fB1/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6F87D756DAf0503d08Eb8993686c7Fc01Dc44fB1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6F87D756DAf0503d08Eb8993686c7Fc01Dc44fB1"
          }
        },
        {
          "chainId": 101,
          "address": "FTPnEQ3NfRRZ9tvmpDW6JFrvweBE5sanxnXSpJL1dvbB",
          "symbol": "wBIRD",
          "name": "Bird.Money (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x70401dFD142A16dC7031c56E862Fc88Cb9537Ce0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x70401dFD142A16dC7031c56E862Fc88Cb9537Ce0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x70401dFD142A16dC7031c56E862Fc88Cb9537Ce0"
          }
        },
        {
          "chainId": 101,
          "address": "QVDE6rhcGPSB3ex5T7vWBzvoSRUXULjuSGpVuKwu5XH",
          "symbol": "wAXN",
          "name": "Axion (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x71F85B2E46976bD21302B64329868fd15eb0D127/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x71F85B2E46976bD21302B64329868fd15eb0D127",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x71F85B2E46976bD21302B64329868fd15eb0D127"
          }
        },
        {
          "chainId": 101,
          "address": "J6AbGG62yo9UJ2T9r9GM7pnoRNui5DsZDnPbiNAPqbVd",
          "symbol": "wBMI",
          "name": "Bridge Mutual (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x725C263e32c72dDC3A19bEa12C5a0479a81eE688/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x725C263e32c72dDC3A19bEa12C5a0479a81eE688",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x725C263e32c72dDC3A19bEa12C5a0479a81eE688"
          }
        },
        {
          "chainId": 101,
          "address": "4wvHoaxxZxFeNrMTP8bLVRh1ziSBV7crN665WX4rRMqe",
          "symbol": "wDYT",
          "name": "DoYourTip (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x740623d2c797b7D8D1EcB98e9b4Afcf99Ec31E14/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x740623d2c797b7D8D1EcB98e9b4Afcf99Ec31E14",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x740623d2c797b7D8D1EcB98e9b4Afcf99Ec31E14"
          }
        },
        {
          "chainId": 101,
          "address": "Fe5fWjCLDMJoi4sTmfR2VW4BT1LwsbR1n6QAjzJQvhhf",
          "symbol": "wBBR",
          "name": "BitberryToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7671904eed7f10808B664fc30BB8693FD7237abF/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7671904eed7f10808B664fc30BB8693FD7237abF",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7671904eed7f10808B664fc30BB8693FD7237abF"
          }
        },
        {
          "chainId": 101,
          "address": "5J9yhFRnQZx3RiqHzfQpAffX5UQz3k8vQCZH2g9Z9sDg",
          "symbol": "wWAXE",
          "name": "WAX Economic Token (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7a2Bc711E19ba6aff6cE8246C546E8c4B4944DFD/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7a2Bc711E19ba6aff6cE8246C546E8c4B4944DFD",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7a2Bc711E19ba6aff6cE8246C546E8c4B4944DFD"
          }
        },
        {
          "chainId": 101,
          "address": "4DHywS5EjUTF5AYisPZiJbWcCV4gfpH98oKxpgyKRnnQ",
          "symbol": "wMATIC",
          "name": "Matic Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7D1AfA7B718fb893dB30A3aBc0Cfc608AaCfeBB0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7D1AfA7B718fb893dB30A3aBc0Cfc608AaCfeBB0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7D1AfA7B718fb893dB30A3aBc0Cfc608AaCfeBB0"
          }
        },
        {
          "chainId": 101,
          "address": "Au9E8ygQdTJQZXmNKPdtLEP8rGjC4qsGRhkJgjFNPAr8",
          "symbol": "wXRT",
          "name": "Robonomics (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7dE91B204C1C737bcEe6F000AAA6569Cf7061cb7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7dE91B204C1C737bcEe6F000AAA6569Cf7061cb7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7dE91B204C1C737bcEe6F000AAA6569Cf7061cb7"
          }
        },
        {
          "chainId": 101,
          "address": "5DQZ14hLDxveMH7NyGmTmUTRGgVAVXADp3cP2UHeH6hM",
          "symbol": "wAAVE",
          "name": "Aave Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x7Fc66500c84A76Ad7e9c93437bFc5Ac33E2DDaE9/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7Fc66500c84A76Ad7e9c93437bFc5Ac33E2DDaE9",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7Fc66500c84A76Ad7e9c93437bFc5Ac33E2DDaE9"
          }
        },
        {
          "chainId": 101,
          "address": "Arc2ZVKNCdDU4vB8Ubud5QayDtjo2oJF9xVrUPQ6TWxF",
          "symbol": "wLEND",
          "name": "Lend (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x80fB784B7eD66730e8b1DBd9820aFD29931aab03/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x80fB784B7eD66730e8b1DBd9820aFD29931aab03",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x80fB784B7eD66730e8b1DBd9820aFD29931aab03"
          }
        },
        {
          "chainId": 101,
          "address": "2ctKUDkGBnVykt31AhMPhHvAQWJvoNGbLh7aRidjtAqv",
          "symbol": "wPOLS",
          "name": "PolkastarterToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x83e6f1E41cdd28eAcEB20Cb649155049Fac3D5Aa/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x83e6f1E41cdd28eAcEB20Cb649155049Fac3D5Aa",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x83e6f1E41cdd28eAcEB20Cb649155049Fac3D5Aa"
          }
        },
        {
          "chainId": 101,
          "address": "8FnkznYpHvKiaBkgatVoCrNiS5y5KW62JqgjnxVhDejC",
          "symbol": "wUBT",
          "name": "Unibright (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8400D94A5cb0fa0D041a3788e395285d61c9ee5e/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8400D94A5cb0fa0D041a3788e395285d61c9ee5e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8400D94A5cb0fa0D041a3788e395285d61c9ee5e"
          }
        },
        {
          "chainId": 101,
          "address": "4LLAYXVmT3U8Sew6k3tk66zk3btT91QRzQzxcNX8XhzV",
          "symbol": "wDIA",
          "name": "DIA (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x84cA8bc7997272c7CfB4D0Cd3D55cd942B3c9419/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x84cA8bc7997272c7CfB4D0Cd3D55cd942B3c9419",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x84cA8bc7997272c7CfB4D0Cd3D55cd942B3c9419"
          }
        },
        {
          "chainId": 101,
          "address": "8L8pDf3jutdpdr4m3np68CL9ZroLActrqwxi6s9Ah5xU",
          "symbol": "wFRAX",
          "name": "Frax (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x853d955aCEf822Db058eb8505911ED77F175b99e/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x853d955aCEf822Db058eb8505911ED77F175b99e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x853d955aCEf822Db058eb8505911ED77F175b99e"
          }
        },
        {
          "chainId": 101,
          "address": "H3oVL2zJpHJaDoRfQmSrftv3fkGzvsiQgugCZmcRBykG",
          "symbol": "wKEEP",
          "name": "KEEP Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x85Eee30c52B0b379b046Fb0F85F4f3Dc3009aFEC/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x85Eee30c52B0b379b046Fb0F85F4f3Dc3009aFEC",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x85Eee30c52B0b379b046Fb0F85F4f3Dc3009aFEC"
          }
        },
        {
          "chainId": 101,
          "address": "64oqP1dFqqD8NEL4RPCpMyrHmpo31rj3nYxULVXvayfW",
          "symbol": "wRSR",
          "name": "Reserve Rights (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8762db106B2c2A0bccB3A80d1Ed41273552616E8/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8762db106B2c2A0bccB3A80d1Ed41273552616E8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8762db106B2c2A0bccB3A80d1Ed41273552616E8"
          }
        },
        {
          "chainId": 101,
          "address": "5SU7veiCRA16ZxnS24kCC1dwQYVwi3whvTdM48iNE1Rm",
          "symbol": "wMPH",
          "name": "88mph.app (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8888801aF4d980682e47f1A9036e589479e835C5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8888801aF4d980682e47f1A9036e589479e835C5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8888801aF4d980682e47f1A9036e589479e835C5"
          }
        },
        {
          "chainId": 101,
          "address": "5fv26ojhPHWNaikXcMf2TBu4JENjLQ2PWgWYeitttVwv",
          "symbol": "wPAID",
          "name": "PAID Network (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8c8687fC965593DFb2F0b4EAeFD55E9D8df348df/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8c8687fC965593DFb2F0b4EAeFD55E9D8df348df",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8c8687fC965593DFb2F0b4EAeFD55E9D8df348df"
          }
        },
        {
          "chainId": 101,
          "address": "ACr98v3kv9qaGnR3p2BfsoSK9Q2ZmP6zUkm3qxv5ZJDd",
          "symbol": "wSXP",
          "name": "Swipe (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8CE9137d39326AD0cD6491fb5CC0CbA0e089b6A9/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8CE9137d39326AD0cD6491fb5CC0CbA0e089b6A9",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8CE9137d39326AD0cD6491fb5CC0CbA0e089b6A9"
          }
        },
        {
          "chainId": 101,
          "address": "7gBuzBcJ7V48m8TiKJ1XWNDUerK2XfAbjxuRiKMb6S8Z",
          "symbol": "wREQ",
          "name": "Request Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x8f8221aFbB33998d8584A2B05749bA73c37a938a/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8f8221aFbB33998d8584A2B05749bA73c37a938a",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8f8221aFbB33998d8584A2B05749bA73c37a938a"
          }
        },
        {
          "chainId": 101,
          "address": "CtDjsryLtwZCLj8TeniV7tWHbkaREfjKDWpvyQvsTyek",
          "symbol": "wWHALE",
          "name": "WHALE (Wormhole)",
          "decimals": 4,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x9355372396e3F6daF13359B7b607a3374cc638e0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9355372396e3F6daF13359B7b607a3374cc638e0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9355372396e3F6daF13359B7b607a3374cc638e0"
          }
        },
        {
          "chainId": 101,
          "address": "JDUgn6JUSwufqqthRdnZZKWv2vEdYvHxigF5Hk79yxRm",
          "symbol": "wPNK",
          "name": "Pinakion (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x93ED3FBe21207Ec2E8f2d3c3de6e058Cb73Bc04d/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x93ED3FBe21207Ec2E8f2d3c3de6e058Cb73Bc04d",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x93ED3FBe21207Ec2E8f2d3c3de6e058Cb73Bc04d"
          }
        },
        {
          "chainId": 101,
          "address": "EJKqF4p7xVhXkcDNCrVQJE4osow76226bc6u3AtsGXaG",
          "symbol": "wAPY",
          "name": "APY Governance Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x95a4492F028aa1fd432Ea71146b433E7B4446611/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x95a4492F028aa1fd432Ea71146b433E7B4446611",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x95a4492F028aa1fd432Ea71146b433E7B4446611"
          }
        },
        {
          "chainId": 101,
          "address": "AF7Dv5Vzi1dT2fLnz4ysiRQ6FxGN1M6mrmHwgNpx7FVH",
          "symbol": "wOCEAN",
          "name": "Ocean Protocol (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x967da4048cD07aB37855c090aAF366e4ce1b9F48/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x967da4048cD07aB37855c090aAF366e4ce1b9F48",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x967da4048cD07aB37855c090aAF366e4ce1b9F48"
          }
        },
        {
          "chainId": 101,
          "address": "AyNULvvLGW11fThvhncqNRjEgmDbMEHdDL4HqXD6SM8V",
          "symbol": "wSPI",
          "name": "Shopping.io (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x9B02dD390a603Add5c07f9fd9175b7DABE8D63B7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9B02dD390a603Add5c07f9fd9175b7DABE8D63B7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9B02dD390a603Add5c07f9fd9175b7DABE8D63B7"
          }
        },
        {
          "chainId": 101,
          "address": "3UeKTABxz9XexDtyKq646rSQvx8GVpKNwfMoKKfxsTsF",
          "symbol": "wBBTC",
          "name": "Binance Wrapped BTC (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x9BE89D2a4cd102D8Fecc6BF9dA793be995C22541/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9BE89D2a4cd102D8Fecc6BF9dA793be995C22541",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9BE89D2a4cd102D8Fecc6BF9dA793be995C22541"
          }
        },
        {
          "chainId": 101,
          "address": "DsGbyCHbG4vSWBqAprR2eWuUAg8fXAgYkWL9psgvYZn5",
          "symbol": "wUNISTAKE",
          "name": "Unistake (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x9Ed8e7C9604790F7Ec589F99b94361d8AAB64E5E/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9Ed8e7C9604790F7Ec589F99b94361d8AAB64E5E",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9Ed8e7C9604790F7Ec589F99b94361d8AAB64E5E"
          }
        },
        {
          "chainId": 101,
          "address": "GBvv3jn9u6pZqPd2GVnQ7BKJzLwQnEWe4ci9k359PN9Z",
          "symbol": "wMKR",
          "name": "MakerDAO (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x9f8F72aA9304c8B593d555F12eF6589cC3A579A2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9f8F72aA9304c8B593d555F12eF6589cC3A579A2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9f8F72aA9304c8B593d555F12eF6589cC3A579A2"
          }
        },
        {
          "chainId": 101,
          "address": "53ETjuzUNHG8c7rZ2hxQLQfN5R6tEYtdYwNQsa68xFUk",
          "symbol": "wFARM",
          "name": "FARM Reward Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xa0246c9032bC3A600820415aE600c6388619A14D/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa0246c9032bC3A600820415aE600c6388619A14D",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa0246c9032bC3A600820415aE600c6388619A14D"
          }
        },
        {
          "chainId": 101,
          "address": "FVsXUnbhifqJ4LiXQEbpUtXVdB8T5ADLKqSs5t1oc54F",
          "symbol": "wUSDC",
          "name": "USD Coin (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48"
          }
        },
        {
          "chainId": 101,
          "address": "EjBpnWzWZeW1PKzfCszLdHgENZLZDoTNaEmz8BddpWJx",
          "symbol": "wANT",
          "name": "Aragon Network Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xa117000000f279D81A1D3cc75430fAA017FA5A2e/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa117000000f279D81A1D3cc75430fAA017FA5A2e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa117000000f279D81A1D3cc75430fAA017FA5A2e"
          }
        },
        {
          "chainId": 101,
          "address": "Rs4LHZ4WogZCAkCzfsKJib5LLnYL6xcVAfTcLQiSjg2",
          "symbol": "wNPXS",
          "name": "Pundi X Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA15C7Ebe1f07CaF6bFF097D8a589fb8AC49Ae5B3/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xA15C7Ebe1f07CaF6bFF097D8a589fb8AC49Ae5B3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xA15C7Ebe1f07CaF6bFF097D8a589fb8AC49Ae5B3"
          }
        },
        {
          "chainId": 101,
          "address": "65ribugkb42AANKYrEeuruhhfXffyE4jY22FUxFbpW7C",
          "symbol": "wRFOX",
          "name": "RFOX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xa1d6Df714F91DeBF4e0802A542E13067f31b8262/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa1d6Df714F91DeBF4e0802A542E13067f31b8262",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa1d6Df714F91DeBF4e0802A542E13067f31b8262"
          }
        },
        {
          "chainId": 101,
          "address": "T2mo6dnFiutu26KMuCMSjCLBB4ofWvQ3qBJGEMc3JSe",
          "symbol": "wMTA",
          "name": "Meta (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xa3BeD4E1c75D00fa6f4E5E6922DB7261B5E9AcD2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa3BeD4E1c75D00fa6f4E5E6922DB7261B5E9AcD2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa3BeD4E1c75D00fa6f4E5E6922DB7261B5E9AcD2"
          }
        },
        {
          "chainId": 101,
          "address": "HC8SaUm9rhvVZE5ZwBWiUhFAnCuG8byd5FxKYdpFm5MR",
          "symbol": "wRBC",
          "name": "Rubic (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA4EED63db85311E22dF4473f87CcfC3DaDCFA3E3/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xA4EED63db85311E22dF4473f87CcfC3DaDCFA3E3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xA4EED63db85311E22dF4473f87CcfC3DaDCFA3E3"
          }
        },
        {
          "chainId": 101,
          "address": "9DdtKWoK8cBfLSLhHXHFZzzhxp4rdwHbFEAis8n5AsfQ",
          "symbol": "wNOIA",
          "name": "NOIA Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xa8c8CfB141A3bB59FEA1E2ea6B79b5ECBCD7b6ca/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa8c8CfB141A3bB59FEA1E2ea6B79b5ECBCD7b6ca",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa8c8CfB141A3bB59FEA1E2ea6B79b5ECBCD7b6ca"
          }
        },
        {
          "chainId": 101,
          "address": "DTQStP2z4DRqbNHRxtwThAujr9aPFPsv4y2kkXTVLVvb",
          "symbol": "wCEL",
          "name": "Celsius (Wormhole)",
          "decimals": 4,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xaaAEBE6Fe48E54f431b0C390CfaF0b017d09D42d/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xaaAEBE6Fe48E54f431b0C390CfaF0b017d09D42d",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xaaAEBE6Fe48E54f431b0C390CfaF0b017d09D42d"
          }
        },
        {
          "chainId": 101,
          "address": "59NPV18vAbTgwC9aeEGikrmX3EbZHMEMkZfvcsHBNFr9",
          "symbol": "wCWS",
          "name": "Crowns (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xaC0104Cca91D167873B8601d2e71EB3D4D8c33e0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xaC0104Cca91D167873B8601d2e71EB3D4D8c33e0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xaC0104Cca91D167873B8601d2e71EB3D4D8c33e0"
          }
        },
        {
          "chainId": 101,
          "address": "4811JP9i35zgAxSFZjGXQwew6xd1qSBE4xdMFik2J14Z",
          "symbol": "wROOM",
          "name": "OptionRoom Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xAd4f86a25bbc20FfB751f2FAC312A0B4d8F88c64/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xAd4f86a25bbc20FfB751f2FAC312A0B4d8F88c64",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xAd4f86a25bbc20FfB751f2FAC312A0B4d8F88c64"
          }
        },
        {
          "chainId": 101,
          "address": "2VAdvHWMpzMnDYYn64MgqLNpGQ19iCiusCet8JLMtxU5",
          "symbol": "wYOP",
          "name": "YOP (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xAE1eaAE3F627AAca434127644371b67B18444051/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xAE1eaAE3F627AAca434127644371b67B18444051",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xAE1eaAE3F627AAca434127644371b67B18444051"
          }
        },
        {
          "chainId": 101,
          "address": "AKiTcEWZarsnUbKkwQVRjJni5eqwiNeBQsJ3nrADacT4",
          "symbol": "wLGCY",
          "name": "LGCY Network (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xaE697F994Fc5eBC000F8e22EbFfeE04612f98A0d/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xaE697F994Fc5eBC000F8e22EbFfeE04612f98A0d",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xaE697F994Fc5eBC000F8e22EbFfeE04612f98A0d"
          }
        },
        {
          "chainId": 101,
          "address": "4kPHTMfSD1k3SytAMKEVRWH5ip6WD5U52tC5q6TuXUNU",
          "symbol": "wRFuel",
          "name": "Rio Fuel Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xaf9f549774ecEDbD0966C52f250aCc548D3F36E5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xaf9f549774ecEDbD0966C52f250aCc548D3F36E5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xaf9f549774ecEDbD0966C52f250aCc548D3F36E5"
          }
        },
        {
          "chainId": 101,
          "address": "E1w2uKRsVJeDf1Qqbk7DDKEDe7NCYwh8ySgqCaEZ4BTC",
          "symbol": "wMAHA",
          "name": "MahaDAO (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xB4d930279552397bbA2ee473229f89Ec245bc365/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB4d930279552397bbA2ee473229f89Ec245bc365",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB4d930279552397bbA2ee473229f89Ec245bc365"
          }
        },
        {
          "chainId": 101,
          "address": "4psmnTirimNyPEPEZtkQkdEPJagTXS3a7wsu1XN9MYK3",
          "symbol": "wRPL",
          "name": "Rocket Pool (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xB4EFd85c19999D84251304bDA99E90B92300Bd93/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB4EFd85c19999D84251304bDA99E90B92300Bd93",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB4EFd85c19999D84251304bDA99E90B92300Bd93"
          }
        },
        {
          "chainId": 101,
          "address": "FrhQauNRm7ecom9FRprNcyz58agDe5ujAbAtA9NG6jtU",
          "symbol": "wNEXO",
          "name": "Nexo (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xB62132e35a6c13ee1EE0f84dC5d40bad8d815206/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB62132e35a6c13ee1EE0f84dC5d40bad8d815206",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB62132e35a6c13ee1EE0f84dC5d40bad8d815206"
          }
        },
        {
          "chainId": 101,
          "address": "AoU75vwpnWEVvfarxRALjzRc8vS9UdDhRMkwoDimt9ss",
          "symbol": "wSFI",
          "name": "Spice (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xb753428af26E81097e7fD17f40c88aaA3E04902c/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xb753428af26E81097e7fD17f40c88aaA3E04902c",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xb753428af26E81097e7fD17f40c88aaA3E04902c"
          }
        },
        {
          "chainId": 101,
          "address": "CRZuALvCYjPLB65WFLHh9JkmPWK5C81TXpy2aEEaCjr3",
          "symbol": "wSTBZ",
          "name": "Stabilize Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xB987D48Ed8f2C468D52D6405624EADBa5e76d723/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB987D48Ed8f2C468D52D6405624EADBa5e76d723",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB987D48Ed8f2C468D52D6405624EADBa5e76d723"
          }
        },
        {
          "chainId": 101,
          "address": "HPYXGSdAwyK5GwmuivL8gDdUVRChtgXq6SRat44k4Pat",
          "symbol": "wBAL",
          "name": "Balancer (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xba100000625a3754423978a60c9317c58a424e3D/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xba100000625a3754423978a60c9317c58a424e3D",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xba100000625a3754423978a60c9317c58a424e3D"
          }
        },
        {
          "chainId": 101,
          "address": "AV7NgJV2BsgEukzUTrcUMz3LD37xLcLtygFig5WJ3kQN",
          "symbol": "wBAND",
          "name": "BandToken (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xBA11D00c5f74255f56a5E366F4F77f5A186d7f55/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xBA11D00c5f74255f56a5E366F4F77f5A186d7f55",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xBA11D00c5f74255f56a5E366F4F77f5A186d7f55"
          }
        },
        {
          "chainId": 101,
          "address": "4obZok5FFUcQXQoV39hhcqk9xSmo4WnP9wnrNCk1g5BC",
          "symbol": "wSWFL",
          "name": "Swapfolio (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xBa21Ef4c9f433Ede00badEFcC2754B8E74bd538A/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xBa21Ef4c9f433Ede00badEFcC2754B8E74bd538A",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xBa21Ef4c9f433Ede00badEFcC2754B8E74bd538A"
          }
        },
        {
          "chainId": 101,
          "address": "HCP8hGKS6fUGfTA1tQxBKzbXuQk7yktzz71pY8LXVJyR",
          "symbol": "wLRC",
          "name": "LoopringCoin V2 (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xBBbbCA6A901c926F240b89EacB641d8Aec7AEafD/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xBBbbCA6A901c926F240b89EacB641d8Aec7AEafD",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xBBbbCA6A901c926F240b89EacB641d8Aec7AEafD"
          }
        },
        {
          "chainId": 101,
          "address": "9sNArcS6veh7DLEo7Y1ZSbBCYtkuPVE6S3HhVrcWR2Zw",
          "symbol": "wPERP",
          "name": "Perpetual (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xbC396689893D065F41bc2C6EcbeE5e0085233447/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xbC396689893D065F41bc2C6EcbeE5e0085233447",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xbC396689893D065F41bc2C6EcbeE5e0085233447"
          }
        },
        {
          "chainId": 101,
          "address": "3XnhArdJydrpbr9Nbj8wNUaozPL9WAo9YDyNWakhTm9X",
          "symbol": "wCOMP",
          "name": "Compound (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xc00e94Cb662C3520282E6f5717214004A7f26888/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xc00e94Cb662C3520282E6f5717214004A7f26888",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xc00e94Cb662C3520282E6f5717214004A7f26888"
          }
        },
        {
          "chainId": 101,
          "address": "CPLNm9UMKfiJKiySQathV99yeSgTVjPDZx4ucFrbp2MD",
          "symbol": "wSNX",
          "name": "Synthetix Network Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets//logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xC011a73ee8576Fb46F5E1c5751cA3B9Fe0af2a6F",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xC011a73ee8576Fb46F5E1c5751cA3B9Fe0af2a6F"
          }
        },
        {
          "chainId": 101,
          "address": "D6eVKSfLdioqo2zG8LbQYFU2gf66FrjKA7afCYNo1GHt",
          "symbol": "wDUCK",
          "name": "DLP Duck Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xC0bA369c8Db6eB3924965e5c4FD0b4C1B91e305F/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xC0bA369c8Db6eB3924965e5c4FD0b4C1B91e305F",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xC0bA369c8Db6eB3924965e5c4FD0b4C1B91e305F"
          }
        },
        {
          "chainId": 101,
          "address": "9PwPi3DAf9Dy4Y6qJmUzF6fX9CjNwScBidsYqJmcApF8",
          "symbol": "wCHAIN",
          "name": "Chain Games (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xC4C2614E694cF534D407Ee49F8E44D125E4681c4/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xC4C2614E694cF534D407Ee49F8E44D125E4681c4",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xC4C2614E694cF534D407Ee49F8E44D125E4681c4"
          }
        },
        {
          "chainId": 101,
          "address": "BmxZ1pghpcoyT7aykj7D1o4AxWirTqvD7zD2tNngjirT",
          "symbol": "wGRT",
          "name": "Graph Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xc944E90C64B2c07662A292be6244BDf05Cda44a7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xc944E90C64B2c07662A292be6244BDf05Cda44a7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xc944E90C64B2c07662A292be6244BDf05Cda44a7"
          }
        },
        {
          "chainId": 101,
          "address": "FMr15arp651N6fR2WEL36pCMBnFecHcN6wDxne2Vf3SK",
          "symbol": "wROOT",
          "name": "RootKit (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xCb5f72d37685C3D5aD0bB5F982443BC8FcdF570E/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xCb5f72d37685C3D5aD0bB5F982443BC8FcdF570E",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xCb5f72d37685C3D5aD0bB5F982443BC8FcdF570E"
          }
        },
        {
          "chainId": 101,
          "address": "E9X7rKAGfSh1gsHC6qh5MVLkDzRcT64KQbjzvHnc5zEq",
          "symbol": "wSWAP",
          "name": "TrustSwap Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xCC4304A31d09258b0029eA7FE63d032f52e44EFe/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xCC4304A31d09258b0029eA7FE63d032f52e44EFe",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xCC4304A31d09258b0029eA7FE63d032f52e44EFe"
          }
        },
        {
          "chainId": 101,
          "address": "5NEENV1mNvu7MfNNtKuGSDC8zoNStq1tuLkDXFtv6rZd",
          "symbol": "wTVK",
          "name": "Terra Virtua Kolect (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xd084B83C305daFD76AE3E1b4E1F1fe2eCcCb3988/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xd084B83C305daFD76AE3E1b4E1F1fe2eCcCb3988",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xd084B83C305daFD76AE3E1b4E1F1fe2eCcCb3988"
          }
        },
        {
          "chainId": 101,
          "address": "5ZXLGj7onpitgtREJNYb51DwDPddvqV1YLC8jn2sgz48",
          "symbol": "wOMG",
          "name": "OMG Network (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets//logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xd26114cd6EE289AccF82350c8d8487fedB8A0C07",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xd26114cd6EE289AccF82350c8d8487fedB8A0C07"
          }
        },
        {
          "chainId": 101,
          "address": "2Xf2yAXJfg82sWwdLUo2x9mZXy6JCdszdMZkcF1Hf4KV",
          "symbol": "wLUNA",
          "name": "Wrapped LUNA Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xd2877702675e6cEb975b4A1dFf9fb7BAF4C91ea9/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xd2877702675e6cEb975b4A1dFf9fb7BAF4C91ea9",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xd2877702675e6cEb975b4A1dFf9fb7BAF4C91ea9"
          }
        },
        {
          "chainId": 101,
          "address": "5Ro6JxJ4NjSTEppdX2iXUYgWkAEF1dcs9gqMX99E2vkL",
          "symbol": "wBONDLY",
          "name": "Bondly Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xD2dDa223b2617cB616c1580db421e4cFAe6a8a85/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD2dDa223b2617cB616c1580db421e4cFAe6a8a85",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD2dDa223b2617cB616c1580db421e4cFAe6a8a85"
          }
        },
        {
          "chainId": 101,
          "address": "5jFzUEqWLnvGvKWb1Pji9nWVYy5vLG2saoXCyVNWEdEi",
          "symbol": "wDETS",
          "name": "Dextrust (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xd379700999F4805Ce80aa32DB46A94dF64561108/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xd379700999F4805Ce80aa32DB46A94dF64561108",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xd379700999F4805Ce80aa32DB46A94dF64561108"
          }
        },
        {
          "chainId": 101,
          "address": "BV5tm1uCRWQCQKNgQVFnkseqAjxpmbJkRCXvzFWBdgMp",
          "symbol": "wAMPL",
          "name": "Ampleforth (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets//logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD46bA6D942050d489DBd938a2C909A5d5039A161",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD46bA6D942050d489DBd938a2C909A5d5039A161"
          }
        },
        {
          "chainId": 101,
          "address": "2PSvGigDY4MVUmv51bBiARBMcHBtXcUBnx5V9BwWbbi2",
          "symbol": "wPOLK",
          "name": "Polkamarkets (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xD478161C952357F05f0292B56012Cd8457F1cfbF/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD478161C952357F05f0292B56012Cd8457F1cfbF",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD478161C952357F05f0292B56012Cd8457F1cfbF"
          }
        },
        {
          "chainId": 101,
          "address": "ApmXkxXCASdxRf3Ln6Ni7oAZ7E6CX1CcJAD8A5qBdhSm",
          "symbol": "wCRV",
          "name": "Curve DAO Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xD533a949740bb3306d119CC777fa900bA034cd52/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD533a949740bb3306d119CC777fa900bA034cd52",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD533a949740bb3306d119CC777fa900bA034cd52"
          }
        },
        {
          "chainId": 101,
          "address": "DWECGzR56MruYJyo5g5QpoxZbFoydt3oWUkkDsVhxXzs",
          "symbol": "wMEME",
          "name": "MEME (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xD5525D397898e5502075Ea5E830d8914f6F0affe/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD5525D397898e5502075Ea5E830d8914f6F0affe",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD5525D397898e5502075Ea5E830d8914f6F0affe"
          }
        },
        {
          "chainId": 101,
          "address": "3Y2wTtM4kCX8uUSLrKJ8wpajCu1C9LaWWAd7b7Nb2BDw",
          "symbol": "wEXNT",
          "name": "ExNetwork Community Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xD6c67B93a7b248dF608a653d82a100556144c5DA/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xD6c67B93a7b248dF608a653d82a100556144c5DA",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xD6c67B93a7b248dF608a653d82a100556144c5DA"
          }
        },
        {
          "chainId": 101,
          "address": "9w97GdWUYYaamGwdKMKZgGzPduZJkiFizq4rz5CPXRv2",
          "symbol": "wUSDT",
          "name": "Tether USD (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xdAC17F958D2ee523a2206206994597C13D831ec7/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xdAC17F958D2ee523a2206206994597C13D831ec7",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xdAC17F958D2ee523a2206206994597C13D831ec7"
          }
        },
        {
          "chainId": 101,
          "address": "CqWSJtkMMY16q9QLnQxktM1byzVHGRr8b6LCPuZnEeiL",
          "symbol": "wYLD",
          "name": "Yield (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xDcB01cc464238396E213a6fDd933E36796eAfF9f/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xDcB01cc464238396E213a6fDd933E36796eAfF9f",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xDcB01cc464238396E213a6fDd933E36796eAfF9f"
          }
        },
        {
          "chainId": 101,
          "address": "26ZzQVGZruwcZPs2sqb8n9ojKt2cviUjHcMjstFtK6ow",
          "symbol": "wKNC",
          "name": "Kyber Network Crystal (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xdd974D5C2e2928deA5F71b9825b8b646686BD200/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xdd974D5C2e2928deA5F71b9825b8b646686BD200",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xdd974D5C2e2928deA5F71b9825b8b646686BD200"
          }
        },
        {
          "chainId": 101,
          "address": "HHoHTtntq2kiBPENyVM1DTP7pNrkBXX2Jye29PSyz3qf",
          "symbol": "wCOTI",
          "name": "COTI Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xDDB3422497E61e13543BeA06989C0789117555c5/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xDDB3422497E61e13543BeA06989C0789117555c5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xDDB3422497E61e13543BeA06989C0789117555c5"
          }
        },
        {
          "chainId": 101,
          "address": "4sEpUsJ6uJZYi6A2da8EGjKPacRSqYJaPJffPnTqoWVv",
          "symbol": "wINJ",
          "name": "Injective Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xe28b3B32B6c345A34Ff64674606124Dd5Aceca30/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xe28b3B32B6c345A34Ff64674606124Dd5Aceca30",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xe28b3B32B6c345A34Ff64674606124Dd5Aceca30"
          }
        },
        {
          "chainId": 101,
          "address": "G2jrxYSoCSzmohxERa2JzSJMuRM4kiNvRA3DnCv7Lzcz",
          "symbol": "wZRX",
          "name": "0x Protocol Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xE41d2489571d322189246DaFA5ebDe1F4699F498/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xE41d2489571d322189246DaFA5ebDe1F4699F498",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xE41d2489571d322189246DaFA5ebDe1F4699F498"
          }
        },
        {
          "chainId": 101,
          "address": "3bkBFHyof411hGBdcsiM1KSDdErw63Xoj3eLB8yNknB4",
          "symbol": "wSUPER",
          "name": "SuperFarm (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xe53EC727dbDEB9E2d5456c3be40cFF031AB40A55/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xe53EC727dbDEB9E2d5456c3be40cFF031AB40A55",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xe53EC727dbDEB9E2d5456c3be40cFF031AB40A55"
          }
        },
        {
          "chainId": 101,
          "address": "7kkkoa1MB93ELm3vjvyC8GJ65G7eEgLhfaHU58riJUCx",
          "symbol": "waEth",
          "name": "aEthereum (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xE95A203B1a91a908F9B9CE46459d101078c2c3cb/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xE95A203B1a91a908F9B9CE46459d101078c2c3cb",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xE95A203B1a91a908F9B9CE46459d101078c2c3cb"
          }
        },
        {
          "chainId": 101,
          "address": "F48zUwoQMzgCTf5wihwz8GPN23gdcoVMiT227APqA6hC",
          "symbol": "wSURF",
          "name": "SURF.Finance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xEa319e87Cf06203DAe107Dd8E5672175e3Ee976c/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xEa319e87Cf06203DAe107Dd8E5672175e3Ee976c",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xEa319e87Cf06203DAe107Dd8E5672175e3Ee976c"
          }
        },
        {
          "chainId": 101,
          "address": "EK6iyvvqvQtsWYcySrZVHkXjCLX494r9PhnDWJaX1CPu",
          "symbol": "wrenBTC",
          "name": "renBTC (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xEB4C2781e4ebA804CE9a9803C67d0893436bB27D/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xEB4C2781e4ebA804CE9a9803C67d0893436bB27D",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xEB4C2781e4ebA804CE9a9803C67d0893436bB27D"
          }
        },
        {
          "chainId": 101,
          "address": "B2m4B527oLo5WFWLgy2MitP66azhEW2puaazUAuvNgqZ",
          "symbol": "wDMG",
          "name": "DMM: Governance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xEd91879919B71bB6905f23af0A68d231EcF87b14/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xEd91879919B71bB6905f23af0A68d231EcF87b14",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xEd91879919B71bB6905f23af0A68d231EcF87b14"
          }
        },
        {
          "chainId": 101,
          "address": "H3iuZNRwaqPsnGUGU5YkDwTU3hQMkzC32hxDko8EtzZw",
          "symbol": "wHEZ",
          "name": "Hermez Network Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xEEF9f339514298C6A857EfCfC1A762aF84438dEE/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xEEF9f339514298C6A857EfCfC1A762aF84438dEE",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xEEF9f339514298C6A857EfCfC1A762aF84438dEE"
          }
        },
        {
          "chainId": 101,
          "address": "DL7873Hud4eMdGScQFD7vrbC6fzWAMQ2LMuoZSn4zUry",
          "symbol": "wRLY",
          "name": "Rally (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xf1f955016EcbCd7321c7266BccFB96c68ea5E49b/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xf1f955016EcbCd7321c7266BccFB96c68ea5E49b",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xf1f955016EcbCd7321c7266BccFB96c68ea5E49b"
          }
        },
        {
          "chainId": 101,
          "address": "3N89w9KPUVYUK5MMGNY8yMXhrr89QQ1RQPJxVnQHgMdd",
          "symbol": "wYf-DAI",
          "name": "YfDAI.finance (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xf4CD3d3Fda8d7Fd6C5a500203e38640A70Bf9577/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xf4CD3d3Fda8d7Fd6C5a500203e38640A70Bf9577",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xf4CD3d3Fda8d7Fd6C5a500203e38640A70Bf9577"
          }
        },
        {
          "chainId": 101,
          "address": "8ArKbnnDiq8eRR8hZ1eULMjd2iMAD8AqwyVJRAX7mHQo",
          "symbol": "wFCL",
          "name": "Fractal Protocol Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xF4d861575ecC9493420A3f5a14F85B13f0b50EB3/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xF4d861575ecC9493420A3f5a14F85B13f0b50EB3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xF4d861575ecC9493420A3f5a14F85B13f0b50EB3"
          }
        },
        {
          "chainId": 101,
          "address": "ZWGxcTgJCNGQqZn6vFdknwj4AFFsYRZ4SDJuhRn3J1T",
          "symbol": "wAXS",
          "name": "Axie Infinity (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xF5D669627376EBd411E34b98F19C868c8ABA5ADA/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xF5D669627376EBd411E34b98F19C868c8ABA5ADA",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xF5D669627376EBd411E34b98F19C868c8ABA5ADA"
          }
        },
        {
          "chainId": 101,
          "address": "PEjUEMHFRtfajio8YHKZdUruW1vTzGmz6F7NngjYuou",
          "symbol": "wENJ",
          "name": "Enjin Coin (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xF629cBd94d3791C9250152BD8dfBDF380E2a3B9c/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xF629cBd94d3791C9250152BD8dfBDF380E2a3B9c",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xF629cBd94d3791C9250152BD8dfBDF380E2a3B9c"
          }
        },
        {
          "chainId": 101,
          "address": "2cW5deMKeR97C7csq1aMMWUa5RNWkpQFz8tumxk4ZV8w",
          "symbol": "wYLD",
          "name": "Yield (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xF94b5C5651c888d928439aB6514B93944eEE6F48/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xF94b5C5651c888d928439aB6514B93944eEE6F48",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xF94b5C5651c888d928439aB6514B93944eEE6F48"
          }
        },
        {
          "chainId": 101,
          "address": "FR5qPX4gbKHPyKMK7Cey6dHZ7wtqmqRogYPJo6bpd5Uw",
          "symbol": "wDDIM",
          "name": "DuckDaoDime (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xFbEEa1C75E4c4465CB2FCCc9c6d6afe984558E20/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xFbEEa1C75E4c4465CB2FCCc9c6d6afe984558E20",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xFbEEa1C75E4c4465CB2FCCc9c6d6afe984558E20"
          }
        },
        {
          "chainId": 101,
          "address": "8HCWFQA2GsA6Nm2L5jidM3mus7NeeQ8wp1ri3XFF9WWH",
          "symbol": "wRARI",
          "name": "Rarible (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xFca59Cd816aB1eaD66534D82bc21E7515cE441CF/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xFca59Cd816aB1eaD66534D82bc21E7515cE441CF",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xFca59Cd816aB1eaD66534D82bc21E7515cE441CF"
          }
        },
        {
          "chainId": 101,
          "address": "Egrv6hURf5o68xJ1AGYeRv8RNj2nXJVuSoA5wwiSALcN",
          "symbol": "wAMP",
          "name": "Amp (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xfF20817765cB7f73d4bde2e66e067E58D11095C2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xfF20817765cB7f73d4bde2e66e067E58D11095C2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xfF20817765cB7f73d4bde2e66e067E58D11095C2"
          }
        },
        {
          "chainId": 101,
          "address": "GXMaB6jm5cdoQgb65YpkEu61eDYtod3PuVwYYXdZZJ9r",
          "symbol": "wFSW",
          "name": "FalconSwap Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xfffffffFf15AbF397dA76f1dcc1A1604F45126DB/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xfffffffFf15AbF397dA76f1dcc1A1604F45126DB",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xfffffffFf15AbF397dA76f1dcc1A1604F45126DB"
          }
        },
        {
          "chainId": 101,
          "address": "AJ1W9A9N9dEMdVyoDiam2rV44gnBm2csrPDP7xqcapgX",
          "symbol": "wBUSD",
          "name": "Binance USD (Wormhole)",
          "decimals": 9,
          "logoURI": " https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x4Fabb145d64652a948d72533023f6E7A623C7C53/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4Fabb145d64652a948d72533023f6E7A623C7C53",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4Fabb145d64652a948d72533023f6E7A623C7C53"
          }
        },
        {
          "chainId": 101,
          "address": "2VmKuXMwdzouMndWcK7BK2951tBEtYVmGsdU4dXbjyaY",
          "symbol": "waDAI",
          "name": "Aave Interest bearing DAI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aDAI.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xfC1E690f61EFd961294b3e1Ce3313fBD8aa4f85d",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xfC1E690f61EFd961294b3e1Ce3313fBD8aa4f85d"
          }
        },
        {
          "chainId": 101,
          "address": "AXvWVviBmySSdghmuomYHqYB3AZn7NmAWrHYHKKPJxoL",
          "symbol": "waTUSD",
          "name": "Aave Interest bearing TUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aTUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4DA9b813057D04BAef4e5800E36083717b4a0341",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4DA9b813057D04BAef4e5800E36083717b4a0341"
          }
        },
        {
          "chainId": 101,
          "address": "AkaisFPmasQYZUJsZLD9wPEo2KA7aCRqyRawX18ZRzGr",
          "symbol": "waUSDC",
          "name": "Aave Interest bearing USDC (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUSDC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9bA00D6856a4eDF4665BcA2C2309936572473B7E",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9bA00D6856a4eDF4665BcA2C2309936572473B7E"
          }
        },
        {
          "chainId": 101,
          "address": "FZfQtWMoTQ51Z4jxvHfmFcqj4862u9GzmugBnZUuWqR5",
          "symbol": "waUSDT",
          "name": "Aave Interest bearing USDT (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUSDT.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x71fc860F7D3A592A4a98740e39dB31d25db65ae8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x71fc860F7D3A592A4a98740e39dB31d25db65ae8"
          }
        },
        {
          "chainId": 101,
          "address": "BMrbF8DZ9U5KGdJ4F2MJbH5d6KPi5FQVp7EqmLrhDe1f",
          "symbol": "waSUSD",
          "name": "Aave Interest bearing SUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aSUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x625aE63000f46200499120B906716420bd059240",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x625aE63000f46200499120B906716420bd059240"
          }
        },
        {
          "chainId": 101,
          "address": "Fzx4N1xJPDZENAhrAaH79k2izT9CFbfnDEcpcWjiusdY",
          "symbol": "waLEND",
          "name": "Aave Interest bearing LEND (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aLEND.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7D2D3688Df45Ce7C552E19c27e007673da9204B8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7D2D3688Df45Ce7C552E19c27e007673da9204B8"
          }
        },
        {
          "chainId": 101,
          "address": "GCdDiVgZnkWCAnGktUsjhoho2CHab9JfrRy3Q5W51zvC",
          "symbol": "waBAT",
          "name": "Aave Interest bearing BAT (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aBAT.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xE1BA0FB44CCb0D11b80F92f4f8Ed94CA3fF51D00",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xE1BA0FB44CCb0D11b80F92f4f8Ed94CA3fF51D00"
          }
        },
        {
          "chainId": 101,
          "address": "FBrfFh7fb7xKfyBMJA32KufMjEkgSgY4AuzLXFKdJFRj",
          "symbol": "waETH",
          "name": "Aave Interest bearing ETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x3a3A65aAb0dd2A17E3F1947bA16138cd37d08c04",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x3a3A65aAb0dd2A17E3F1947bA16138cd37d08c04"
          }
        },
        {
          "chainId": 101,
          "address": "Adp88WrQDgExPTu26DdBnbN2ffWMkXLxwqzjTdfRQiJi",
          "symbol": "waLINK",
          "name": "Aave Interest bearing LINK (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aLINK.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xA64BD6C70Cb9051F6A9ba1F163Fdc07E0DfB5F84",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xA64BD6C70Cb9051F6A9ba1F163Fdc07E0DfB5F84"
          }
        },
        {
          "chainId": 101,
          "address": "3p67dqghWn6reQcVCqNBkufrpU1gtA1ZRAYja6GMXySG",
          "symbol": "waKNC",
          "name": "Aave Interest bearing KNC (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aKNC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9D91BE44C06d373a8a226E1f3b146956083803eB",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9D91BE44C06d373a8a226E1f3b146956083803eB"
          }
        },
        {
          "chainId": 101,
          "address": "A4qYX1xuewaBL9SeZnwA3We6MhG8TYcTceHAJpk7Etdt",
          "symbol": "waREP",
          "name": "Aave Interest bearing REP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aREP.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x71010A9D003445aC60C4e6A7017c1E89A477B438",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x71010A9D003445aC60C4e6A7017c1E89A477B438"
          }
        },
        {
          "chainId": 101,
          "address": "3iTtcKUVa5ouzwNZFc3SasuAKkY2ZuMxLERRcWfxQVN3",
          "symbol": "waMKR",
          "name": "Aave Interest bearing MKR (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aMKR.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x7deB5e830be29F91E298ba5FF1356BB7f8146998",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x7deB5e830be29F91E298ba5FF1356BB7f8146998"
          }
        },
        {
          "chainId": 101,
          "address": "EMS6TrCU8uBMumZukRSShGS1yzHGqYd3S8hW2sYULX3T",
          "symbol": "waMANA",
          "name": "Aave Interest bearing MANA (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aMANA.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6FCE4A401B6B80ACe52baAefE4421Bd188e76F6f",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6FCE4A401B6B80ACe52baAefE4421Bd188e76F6f"
          }
        },
        {
          "chainId": 101,
          "address": "qhqzfH7AjeukUgqyPXncWHFXTBebFNu5QQUrzhJaLB4",
          "symbol": "waZRX",
          "name": "Aave Interest bearing ZRX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aZRX.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6Fb0855c404E09c47C3fBCA25f08d4E41f9F062f",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6Fb0855c404E09c47C3fBCA25f08d4E41f9F062f"
          }
        },
        {
          "chainId": 101,
          "address": "FeU2J26AfMqh2mh7Cf4Lw1HRueAvAkZYxGr8njFNMeQ2",
          "symbol": "waSNX",
          "name": "Aave Interest bearing SNX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmXj52EGotmpyep84PBycmQnAgCF2sbqxdXFWP3GPZFbEz",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x328C4c80BC7aCa0834Db37e6600A6c49E12Da4DE",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x328C4c80BC7aCa0834Db37e6600A6c49E12Da4DE"
          }
        },
        {
          "chainId": 101,
          "address": "GveRVvWTUH1s26YxyjUnXh1J5mMdu5crC2K2uQy26KXi",
          "symbol": "waWBTC",
          "name": "Aave Interest bearing WBTC (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aWBTC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xFC4B8ED459e00e5400be803A9BB3954234FD50e3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xFC4B8ED459e00e5400be803A9BB3954234FD50e3"
          }
        },
        {
          "chainId": 101,
          "address": "F2WgoHLwV4pfxN4WrUs2q6KkmFCsNorGYQ82oaPNUFLP",
          "symbol": "waBUSD",
          "name": "Aave Interest bearing Binance USD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aBUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6Ee0f7BB50a54AB5253dA0667B0Dc2ee526C30a8",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6Ee0f7BB50a54AB5253dA0667B0Dc2ee526C30a8"
          }
        },
        {
          "chainId": 101,
          "address": "3rNUQJgvfZ5eFsZvCkvdYcbd9ZzS6YmtwQsoUTFKmVd4",
          "symbol": "waENJ",
          "name": "Aave Interest bearing ENJ (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aENJ.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x712DB54daA836B53Ef1EcBb9c6ba3b9Efb073F40",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x712DB54daA836B53Ef1EcBb9c6ba3b9Efb073F40"
          }
        },
        {
          "chainId": 101,
          "address": "BHh8nyDwdUG4uyyQYNqGXGLHPyb83R6Y2fqJrNVKtTsT",
          "symbol": "waREN",
          "name": "Aave Interest bearing REN (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmUgE3UECZxZcCAiqd3V9otfFWLi5fxR8uHd94RxkT3iYb",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x69948cC03f478B95283F7dbf1CE764d0fc7EC54C",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x69948cC03f478B95283F7dbf1CE764d0fc7EC54C"
          }
        },
        {
          "chainId": 101,
          "address": "EE58FVYG1UoY6Givy3K3GSRde9sHMj6X1BnocHBtd3sz",
          "symbol": "waYFI",
          "name": "Aave Interest bearing YFI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmauhqAKU8YLhDhT4M5ZcPMuqEfqkBrBaC31uWC9UXd1ik",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x12e51E77DAAA58aA0E9247db7510Ea4B46F9bEAd",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x12e51E77DAAA58aA0E9247db7510Ea4B46F9bEAd"
          }
        },
        {
          "chainId": 101,
          "address": "8aYsiHR6oVTAcFUzdXDhaPkgRbn4QYRCkdk3ATmAmY4p",
          "symbol": "waAAVE",
          "name": "Aave Interest bearing Aave Token (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aAAVE.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xba3D9687Cf50fE253cd2e1cFeEdE1d6787344Ed5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xba3D9687Cf50fE253cd2e1cFeEdE1d6787344Ed5"
          }
        },
        {
          "chainId": 101,
          "address": "8kwCLkWbv4qTJPcbSV65tWdQmjURjBGRSv6VtC1JTiL8",
          "symbol": "waUNI",
          "name": "Aave Interest bearing Uniswap (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmYdpeez387RdMw6zEEa5rMXuayi748Uc15eFuoa3QhGEJ",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB124541127A0A657f056D9Dd06188c4F1b0e5aab",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB124541127A0A657f056D9Dd06188c4F1b0e5aab"
          }
        },
        {
          "chainId": 101,
          "address": "9NDu1wdjZ7GiY7foAXhia9h1wQU45oTUzyMZKJ31V7JA",
          "symbol": "wstkAAVE",
          "name": "Staked Aave (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/Qmc2N4CsWDH3ZnnggcvbF8dN1JYsKTUyh3rdj5NBZH9KKL",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x4da27a545c0c5B758a6BA100e3a049001de870f5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x4da27a545c0c5B758a6BA100e3a049001de870f5"
          }
        },
        {
          "chainId": 101,
          "address": "GNQ1Goajm3Za8uC1Eptt2yfsrbnkZh2eMJoqxg54sj3o",
          "symbol": "wUniDAIETH",
          "name": "Uniswap DAI LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmYNz8J1h5yefkaAw6tZwUYoJyBTWmBXgAY28ZWZ5rPsLR",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2a1530C4C41db0B0b2bB646CB5Eb1A67b7158667",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2a1530C4C41db0B0b2bB646CB5Eb1A67b7158667"
          }
        },
        {
          "chainId": 101,
          "address": "7NFin546WNvWkhtfftfY77z8C1TrxLbUcKmw5TpHGGtC",
          "symbol": "wUniUSDCETH",
          "name": "Uniswap USDC LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/Qme9QQcNzKvk3FEwEZvvKJWSvDUd41z5geWHNpuJb6di9y",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x97deC872013f6B5fB443861090ad931542878126",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x97deC872013f6B5fB443861090ad931542878126"
          }
        },
        {
          "chainId": 101,
          "address": "7gersKTtU65ERNBNTZKjYgKf7HypR7PDMprcuhQJChaq",
          "symbol": "wUnisETHETH",
          "name": "Uniswap sETH LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmZcwn4eZJpjihH8TApRczQQJdAzpR6Er7g1bvo6PGhxWi",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xe9Cf7887b93150D4F2Da7dFc6D502B216438F244",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xe9Cf7887b93150D4F2Da7dFc6D502B216438F244"
          }
        },
        {
          "chainId": 101,
          "address": "4aqNtSCr77eiEZJ9u9BhPErjEMju6FFdLeBKkE1pdxuK",
          "symbol": "wUniLENDETH",
          "name": "Uniswap LEND LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/Qmcbin86EXd14LhbqLknH9kM3N7oueBYt9qQmZdmMWqrgu",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xcaA7e4656f6A2B59f5f99c745F91AB26D1210DCe",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xcaA7e4656f6A2B59f5f99c745F91AB26D1210DCe"
          }
        },
        {
          "chainId": 101,
          "address": "FDdoYCHwFghBSbnN6suvFR3VFw6kAzfhfGpkAQAGPLC3",
          "symbol": "wUniMKRETH",
          "name": "Uniswap MKR LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmSS94EJyBeHeUmoDmGjQjeuUHQxTcMaD8Zvw8W8XdGDBv",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x2C4Bd064b998838076fa341A83d007FC2FA50957",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x2C4Bd064b998838076fa341A83d007FC2FA50957"
          }
        },
        {
          "chainId": 101,
          "address": "FSSTfbb1vh1TRe8Ja64hC65QTc7pPUhwHh5uTAWj5haH",
          "symbol": "wUniLINKETH",
          "name": "Uniswap LINK LP (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmQWb2cb9QZbTeMTtoWzUpJGNXcZiGXTygbRLKHNNwhk4Y",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xF173214C720f58E03e194085B1DB28B50aCDeeaD",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xF173214C720f58E03e194085B1DB28B50aCDeeaD"
          }
        },
        {
          "chainId": 101,
          "address": "Aci9xBGywrgBxQoFnL6LCoCYuX5k6AqaYhimgSZ1Fhrk",
          "symbol": "waUniETH",
          "name": "Aave Interest bearing UniETH (Wormhole)",
          "decimals": 9,
          "logoURI": " https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6179078872605396Ee62960917128F9477a5DdbB/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6179078872605396Ee62960917128F9477a5DdbB",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6179078872605396Ee62960917128F9477a5DdbB"
          }
        },
        {
          "chainId": 101,
          "address": "GqHK99sW4ym6zy6Kdoh8f7sb2c3qhtB3WRqeyPbAYfmy",
          "symbol": "waUniDAI",
          "name": "Aave Interest bearing UniDAI (Wormhole)",
          "decimals": 9,
          "logoURI": " https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x048930eec73c91B44b0844aEACdEBADC2F2b6efb/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x048930eec73c91B44b0844aEACdEBADC2F2b6efb",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x048930eec73c91B44b0844aEACdEBADC2F2b6efb"
          }
        },
        {
          "chainId": 101,
          "address": "4e4TpGVJMYiz5UBrAXuNmiVJ9yvc7ppJeAn8sXmbnmDi",
          "symbol": "waUniUSDC",
          "name": "Aave Interest bearing UniUSDC (Wormhole)",
          "decimals": 6,
          "logoURI": " https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xe02b2Ad63eFF3Ac1D5827cBd7AB9DD3DaC4f4AD0/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xe02b2Ad63eFF3Ac1D5827cBd7AB9DD3DaC4f4AD0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xe02b2Ad63eFF3Ac1D5827cBd7AB9DD3DaC4f4AD0"
          }
        },
        {
          "chainId": 101,
          "address": "49LoAnQQdo9171zfcWRUoQLYSScrxXobbuwt14xjvfVm",
          "symbol": "waUniUSDT",
          "name": "Aave Interest bearing UniUSDT (Wormhole)",
          "decimals": 6,
          "logoURI": " https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xb977ee318010A5252774171494a1bCB98E7fab65/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xb977ee318010A5252774171494a1bCB98E7fab65",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xb977ee318010A5252774171494a1bCB98E7fab65"
          }
        },
        {
          "chainId": 101,
          "address": "CvG3gtKYJtKRzEUgMeb42xnd8HDjESgLtyJqQ2kuLncp",
          "symbol": "waUniDAIETH",
          "name": "Aave Interest bearing UniDAIETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20DAI%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xBbBb7F2aC04484F7F04A2C2C16f20479791BbB44",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xBbBb7F2aC04484F7F04A2C2C16f20479791BbB44"
          }
        },
        {
          "chainId": 101,
          "address": "GSv5ECZaMfaceZK4WKKzA4tKVDkqtfBASECcmYFWcy4G",
          "symbol": "waUniUSDCETH",
          "name": "Aave Interest bearing UniUSDCETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20USDC%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x1D0e53A0e524E3CC92C1f0f33Ae268FfF8D7E7a5",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x1D0e53A0e524E3CC92C1f0f33Ae268FfF8D7E7a5"
          }
        },
        {
          "chainId": 101,
          "address": "7LUdsedi7qpTJGnFpZo6mWqVtKKpccr9XrQGxJ2xUDPT",
          "symbol": "waUniSETHETH",
          "name": "Aave Interest bearing UniSETHETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20sETH%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x84BBcaB430717ff832c3904fa6515f97fc63C76F",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x84BBcaB430717ff832c3904fa6515f97fc63C76F"
          }
        },
        {
          "chainId": 101,
          "address": "Hc1zHQxg1k2JVwvuv3kqbCyZDEJYfDdNftBMab4EMUx9",
          "symbol": "waUniLENDETH",
          "name": "Aave Interest bearing UniLENDETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20LEND%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xc88ebbf7C523f38Ef3eB8A151273C0F0dA421e63",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xc88ebbf7C523f38Ef3eB8A151273C0F0dA421e63"
          }
        },
        {
          "chainId": 101,
          "address": "9PejEmx6NKDHgf6jpgAWwZsibURKifBakjzDQdtCtAXT",
          "symbol": "waUniMKRETH",
          "name": "Aave Interest bearing UniMKRETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20MKR%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x8c69f7A4C9B38F1b48005D216c398Efb2F1Ce3e4",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x8c69f7A4C9B38F1b48005D216c398Efb2F1Ce3e4"
          }
        },
        {
          "chainId": 101,
          "address": "KcHygDp4o7ENsHjevYM4T3u6R7KHa5VyvkJ7kpmJcYo",
          "symbol": "waUniLINKETH",
          "name": "Aave Interest bearing UniLINKETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUNI%20LINK%20ETH.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9548DB8b1cA9b6c757485e7861918b640390169c",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9548DB8b1cA9b6c757485e7861918b640390169c"
          }
        },
        {
          "chainId": 101,
          "address": "GNPAF84ZEtKYyfuY2fg8tZVwse7LpTSeyYPSyEKFqa2Y",
          "symbol": "waUSDT",
          "name": "Aave interest bearing USDT (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUSDT.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x3Ed3B47Dd13EC9a98b44e6204A523E766B225811",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x3Ed3B47Dd13EC9a98b44e6204A523E766B225811"
          }
        },
        {
          "chainId": 101,
          "address": "3QTknQ3i27rDKm5hvBaScFLQ34xX9N7J7XfEFwy27qbZ",
          "symbol": "waWBTC",
          "name": "Aave interest bearing WBTC (Wormhole)",
          "decimals": 8,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aWBTC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x9ff58f4fFB29fA2266Ab25e75e2A8b3503311656",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x9ff58f4fFB29fA2266Ab25e75e2A8b3503311656"
          }
        },
        {
          "chainId": 101,
          "address": "EbpkofeWyiQouGyxQAgXxEyGtjgq13NSucX3CNvucNpb",
          "symbol": "waWETH",
          "name": "Aave interest bearing WETH (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmUDc7LQN6zKHon9FChTqZc7WGFvGPZe698Bq5HbSYtfk9",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x030bA81f1c18d280636F32af80b9AAd02Cf0854e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x030bA81f1c18d280636F32af80b9AAd02Cf0854e"
          }
        },
        {
          "chainId": 101,
          "address": "67uaa3Z7SX7GC6dqSTjpJLnySLXZpCAK9MHMi3232Bfb",
          "symbol": "waYFI",
          "name": "Aave interest bearing YFI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmauhqAKU8YLhDhT4M5ZcPMuqEfqkBrBaC31uWC9UXd1ik",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x5165d24277cD063F5ac44Efd447B27025e888f37",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x5165d24277cD063F5ac44Efd447B27025e888f37"
          }
        },
        {
          "chainId": 101,
          "address": "9xS6et5uvQ64QsmaGMfzfXrwTsfYPjwEWuiPnBGFgfw",
          "symbol": "waZRX",
          "name": "Aave interest bearing ZRX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aZRX.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xDf7FF54aAcAcbFf42dfe29DD6144A69b629f8C9e",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xDf7FF54aAcAcbFf42dfe29DD6144A69b629f8C9e"
          }
        },
        {
          "chainId": 101,
          "address": "2TZ8s2FwtWqJrWpdFsSf2uM2Fvjw474n6HhTdTEWoLor",
          "symbol": "waUNI",
          "name": "Aave interest bearing UNI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmYdpeez387RdMw6zEEa5rMXuayi748Uc15eFuoa3QhGEJ",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xB9D7CB55f463405CDfBe4E90a6D2Df01C2B92BF1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xB9D7CB55f463405CDfBe4E90a6D2Df01C2B92BF1"
          }
        },
        {
          "chainId": 101,
          "address": "G1o2fHZXyPCeAEcY4o6as7SmVaUu65DRhcq1S4Cfap9T",
          "symbol": "waAAVE",
          "name": "Aave interest bearing AAVE (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aAAVE.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xFFC97d72E13E01096502Cb8Eb52dEe56f74DAD7B",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xFFC97d72E13E01096502Cb8Eb52dEe56f74DAD7B"
          }
        },
        {
          "chainId": 101,
          "address": "8PeWkyvCDHpSgT5oiGFgZQtXSRBij7ZFLJTHAGBntRDH",
          "symbol": "waBAT",
          "name": "Aave interest bearing BAT (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aBAT.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x05Ec93c0365baAeAbF7AefFb0972ea7ECdD39CF1",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x05Ec93c0365baAeAbF7AefFb0972ea7ECdD39CF1"
          }
        },
        {
          "chainId": 101,
          "address": "67opsuaXQ3JRSJ1mmF7aPLSq6JaZcwAmXwcMzUN5PSMv",
          "symbol": "waBUSD",
          "name": "Aave interest bearing BUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aBUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xA361718326c15715591c299427c62086F69923D9",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xA361718326c15715591c299427c62086F69923D9"
          }
        },
        {
          "chainId": 101,
          "address": "4JrrHRS56i9GZkSmGaCY3ZsxMo3JEqQviU64ki7ZJPak",
          "symbol": "waDAI",
          "name": "Aave interest bearing DAI (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aDAI.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x028171bCA77440897B824Ca71D1c56caC55b68A3",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x028171bCA77440897B824Ca71D1c56caC55b68A3"
          }
        },
        {
          "chainId": 101,
          "address": "3LmfKjsSU9hdxfZfcr873DMNR5nnrk8EvdueXg1dTSin",
          "symbol": "waENJ",
          "name": "Aave interest bearing ENJ (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aENJ.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xaC6Df26a590F08dcC95D5a4705ae8abbc88509Ef",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xaC6Df26a590F08dcC95D5a4705ae8abbc88509Ef"
          }
        },
        {
          "chainId": 101,
          "address": "7VD2Gosm34hB7kughTqu1N3sW92hq3XwKLTi1N1tdKrj",
          "symbol": "waKNC",
          "name": "Aave interest bearing KNC (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aKNC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x39C6b3e42d6A679d7D776778Fe880BC9487C2EDA",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x39C6b3e42d6A679d7D776778Fe880BC9487C2EDA"
          }
        },
        {
          "chainId": 101,
          "address": "4erbVWFvdvS5P8ews7kUjqfpCQbA8vurnWyvRLsnZJgv",
          "symbol": "waLINK",
          "name": "Aave interest bearing LINK (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aLINK.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa06bC25B5805d5F8d82847D191Cb4Af5A3e873E0",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa06bC25B5805d5F8d82847D191Cb4Af5A3e873E0"
          }
        },
        {
          "chainId": 101,
          "address": "AXJWqG4SpAEwkMjKYkarKwv6Qfz5rLU3cwt5KtrDAAYe",
          "symbol": "waMANA",
          "name": "Aave interest bearing MANA (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aMANA.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xa685a61171bb30d4072B338c80Cb7b2c865c873E",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xa685a61171bb30d4072B338c80Cb7b2c865c873E"
          }
        },
        {
          "chainId": 101,
          "address": "4kJmfagJzQFuwto5RX6f1xScWYbEVBzEpdjmiqTCnzjJ",
          "symbol": "waMKR",
          "name": "Aave interest bearing MKR (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aMKR.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xc713e5E149D5D0715DcD1c156a020976e7E56B88",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xc713e5E149D5D0715DcD1c156a020976e7E56B88"
          }
        },
        {
          "chainId": 101,
          "address": "DN8jPo8YZTXhLMyDMKcnwFuKqY8wfn2UrpX8ct4rc8Bc",
          "symbol": "waREN",
          "name": "Aave interest bearing REN (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmUgE3UECZxZcCAiqd3V9otfFWLi5fxR8uHd94RxkT3iYb",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xCC12AbE4ff81c9378D670De1b57F8e0Dd228D77a",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xCC12AbE4ff81c9378D670De1b57F8e0Dd228D77a"
          }
        },
        {
          "chainId": 101,
          "address": "HWbJZXJ7s1D1zi5P7yVgRUmZPXvYSFv6vsYU765Ti422",
          "symbol": "waSNX",
          "name": "Aave interest bearing SNX (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmXj52EGotmpyep84PBycmQnAgCF2sbqxdXFWP3GPZFbEz",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x35f6B052C598d933D69A4EEC4D04c73A191fE6c2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x35f6B052C598d933D69A4EEC4D04c73A191fE6c2"
          }
        },
        {
          "chainId": 101,
          "address": "2LForywWWpHzmR5NjSEyF1kcw9ffyLuJX7V7hne2fHfY",
          "symbol": "waSUSD",
          "name": "Aave interest bearing SUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aSUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x6C5024Cd4F8A59110119C56f8933403A539555EB",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6C5024Cd4F8A59110119C56f8933403A539555EB"
          }
        },
        {
          "chainId": 101,
          "address": "Badj3S29a2u1auxmijwg5vGjhPLb1K6WLPoigtWjKPXp",
          "symbol": "waTUSD",
          "name": "Aave interest bearing TUSD (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aTUSD.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0x101cc05f4A51C0319f570d5E146a8C625198e636",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x101cc05f4A51C0319f570d5E146a8C625198e636"
          }
        },
        {
          "chainId": 101,
          "address": "BZCPpva12M9SqJgcpf8jtP9Si6rMANFoUR3i7nchha7M",
          "symbol": "waUSDC",
          "name": "Aave interest bearing USDC (Wormhole)",
          "decimals": 6,
          "logoURI": "https://cloudflare-ipfs.com/ipfs/QmaznB5PRhMC696u8yZuzN6Uwrnp7Zmfa5CydVUMvLJc9i/aUSDC.svg",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "address": "0xBcca60bB61934080951369a648Fb03DF4F96263C",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0xBcca60bB61934080951369a648Fb03DF4F96263C"
          }
        },
        {
          "chainId": 101,
          "address": "4pk3pf9nJDN1im1kNwWJN1ThjE8pCYCTexXYGyFjqKVf",
          "symbol": "oDOP",
          "name": "Dominican Pesos",
          "decimals": 9,
          "logoURI": "https://user-images.githubusercontent.com/9972260/111077928-73bd2280-84c9-11eb-84d4-4032478e3861.png",
          "tags": [
            "stablecoin"
          ],
          "extensions": {
            "website": "https://Odop.io/"
          }
        },
        {
          "chainId": 101,
          "address": "5kjfp2qfRbqCXTQeUYgHNnTLf13eHoKjC5hHynW9DvQE",
          "symbol": "AAPE",
          "name": "AAPE",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/5kjfp2qfRbqCXTQeUYgHNnTLf13eHoKjC5hHynW9DvQE/logo.jpg",
          "tags": [],
          "extensions": {
            "website": "https://aape.io/"
          }
        },
        {
          "chainId": 101,
          "address": "3K6rftdAaQYMPunrtNRHgnK2UAtjm2JwyT2oCiTDouYE",
          "symbol": "COPE",
          "name": "COPE",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/3K6rftdAaQYMPunrtNRHgnK2UAtjm2JwyT2oCiTDouYE/logo.jpg",
          "tags": [
            "trading",
            "index",
            "Algos"
          ],
          "extensions": {
            "website": "https://www.unlimitedcope.com/"
          }
        },
        {
          "chainId": 101,
          "address": "2prC8tcVsXwVJAinhxd2zeMeWMWaVyzPoQeLKyDZRFKd",
          "symbol": "MCAPS",
          "name": "Mango Market Caps",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/2prC8tcVsXwVJAinhxd2zeMeWMWaVyzPoQeLKyDZRFKd/logo.png",
          "tags": [
            "mango"
          ],
          "extensions": {
            "website": "https://initialcapoffering.com/"
          }
        },
        {
          "chainId": 101,
          "address": "2reKm5Y9rmAWfaw5jraYz1BXwGLHMofGMs3iNoBLt4VC",
          "symbol": "DOCE",
          "name": "Doce Finance",
          "decimals": 6,
          "logoURI": "https://pbs.twimg.com/profile_images/1362154816059944963/TZuFp5kN_400x400.png",
          "tags": [],
          "extensions": {
            "website": "https://swap.doce.finance/"
          }
        },
        {
          "chainId": 101,
          "address": "E1PvPRPQvZNivZbXRL61AEGr71npZQ5JGxh4aWX7q9QA",
          "symbol": "INO",
          "name": "iNo Token",
          "decimals": 9,
          "logoURI": "https://ino.llegrand.fr/assets/ino-128.png",
          "tags": [],
          "extensions": {
            "website": "https://ino.llegrand.fr/"
          }
        },
        {
          "chainId": 101,
          "address": "8PMHT4swUMtBzgHnh5U564N5sjPSiUz2cjEQzFnnP1Fo",
          "symbol": "ROPE",
          "name": "Rope Token",
          "decimals": 9,
          "logoURI": "https://ropesolana.com/content/files/rope_token.svg",
          "tags": [],
          "extensions": {
            "website": "https://ropesolana.com/"
          }
        },
        {
          "chainId": 101,
          "address": "5dhkWqrq37F92jBmEyhQP1vbMkbVRz59V7288HH2wBC7",
          "symbol": "SLOCK",
          "name": "SOLLock",
          "decimals": 9,
          "logoURI": "https://sollock.io/token/sollock_icon.png",
          "tags": [
            "safestlaunchpad"
          ],
          "extensions": {
            "website": "https://sollock.io/"
          }
        },
        {
          "chainId": 102,
          "address": "So11111111111111111111111111111111111111112",
          "symbol": "SOL",
          "name": "Wrapped SOL",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://www.solana.com/"
          }
        },
        {
          "chainId": 102,
          "address": "CpMah17kQEL2wqyMKt3mZBdTnZbkbfx4nqmQMFDP5vwp",
          "symbol": "USDC",
          "name": "USD Coin",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48/logo.png",
          "tags": [
            "stablecoin"
          ],
          "extensions": {
            "website": "https://www.centre.io/"
          }
        },
        {
          "chainId": 102,
          "address": "Gmk71cM7j2RMorRsQrsyysM4HsByQx5PuDGtDdqGLWCS",
          "symbol": "spSOL",
          "name": "Stake pool SOL",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
          "tags": [
            "stake-pool"
          ],
          "extensions": {
            "website": "https://www.solana.com/"
          }
        },
        {
          "chainId": 102,
          "address": "2jQc2jDHVCewoWsQJK7JPLetP7UjqXvaFdno8rtrD8Kg",
          "symbol": "sHOG",
          "name": "sHOG",
          "decimals": 6,
          "tags": [
            "stablecoin"
          ]
        },
        {
          "chainId": 103,
          "address": "So11111111111111111111111111111111111111112",
          "symbol": "SOL",
          "name": "Wrapped SOL",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
          "tags": []
        },
        {
          "chainId": 103,
          "address": "DEhAasscXF4kEGxFgJ3bq4PpVGp5wyUxMRvn6TzGVHaw",
          "symbol": "XYZ",
          "name": "XYZ Test",
          "decimals": 0,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48/logo.png",
          "tags": []
        },
        {
          "chainId": 103,
          "address": "2rg5syU3DSwwWs778FQ6yczDKhS14NM3vP4hqnkJ2jsM",
          "symbol": "pSOL",
          "name": "SOL stake pool",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/solana/info/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://solana.com/",
            "background": "https://solana.com/static/8c151e179d2d7e80255bdae6563209f2/6833b/validators.webp"
          }
        },
        {
          "chainId": 103,
          "address": "SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt",
          "symbol": "SRM",
          "name": "Serum",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x476c5E26a75bd202a9683ffD34359C0CC15be0fF/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://projectserum.com/"
          }
        },
        {
          "chainId": 103,
          "address": "7STJWT74tAZzhbNNPRH8WuGDy9GZg27968EwALWuezrH",
          "symbol": "wSUSHI",
          "name": "SushiSwap (Wormhole)",
          "decimals": 9,
          "logoURI": "https://cdn.jsdelivr.net/gh/trustwallet/assets@master/blockchains/ethereum/assets/0x6B3595068778DD592e39A122f4f5a5cF09C90fE2/logo.png",
          "tags": [
            "wrapped",
            "wormhole"
          ],
          "extensions": {
            "website": "https://sushi.com",
            "background": "https://sushi.com/static/media/Background-sm.fd449814.jpg/",
            "address": "0x6B3595068778DD592e39A122f4f5a5cF09C90fE2",
            "bridgeContract": "https://etherscan.io/address/0xf92cD566Ea4864356C5491c177A430C222d7e678",
            "assetContract": "https://etherscan.io/address/0x6B3595068778DD592e39A122f4f5a5cF09C90fE2"
          }
        },
        {
          "chainId": 101,
          "address": "3cXftQWJJEeoysZrhAEjpfCHe9tSKyhYG63xpbue8m3s",
          "symbol": "Kreechures",
          "name": "Kreechures",
          "decimals": 0,
          "logoURI": "https://gateway.pinata.cloud/ipfs/QmQ5YPBFUWeKNFbsBDL8WcXWmu1MwisXZVtwofdZQxmQE9/Kreechure%20logo.svg",
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://www.kreechures.com/",
            "attributes": [
              {
                "image": "https://gateway.pinata.cloud/ipfs/QmWcMyAYpaX3BHJoDq6Fyub71TjaHbRHqErT7MmbDvCXYJ/3cXftQWJJEeoysZrhAEjpfCHe9tSKyhYG63xpbue8m3s.jpg",
                "Generation": 0,
                "Species": 6,
                "Base Rest": 262
              }
            ]
          }
        },
        {
          "chainId": 101,
          "address": "4DrV8khCoPS3sWRj6t1bb2DzT9jD4mZp6nc7Jisuuv1b",
          "symbol": "SPD",
          "name": "Solpad",
          "decimals": 10,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/4DrV8khCoPS3sWRj6t1bb2DzT9jD4mZp6nc7Jisuuv1b/logo.jpg",
          "tags": [],
          "extensions": {
            "website": "https://www.solpad.io/"
          }
        },
        {
          "chainId": 101,
          "address": "7p7AMM6QoA8wPRKeqF87Pt51CRWmWvXPH5TBNMyDWhbH",
          "symbol": "Kreechures",
          "name": "Kreechures",
          "decimals": 0,
          "logoURI": "https://gateway.pinata.cloud/ipfs/QmQ5YPBFUWeKNFbsBDL8WcXWmu1MwisXZVtwofdZQxmQE9/Kreechure%20logo.svg",
          "tags": [
            "nft"
          ],
          "extensions": {
            "website": "https://www.kreechures.com/",
            "attributes": [
              {
                "image": "https://gateway.pinata.cloud/ipfs/QmWcMyAYpaX3BHJoDq6Fyub71TjaHbRHqErT7MmbDvCXYJ/7p7AMM6QoA8wPRKeqF87Pt51CRWmWvXPH5TBNMyDWhbH.jpg",
                "Generation": 0,
                "Species": 4,
                "Base Rest": 335
              }
            ]
          }
        },
        {
          "chainId": 101,
          "address": "6ybxMQpMgQhtsTLhvHZqk8uqao7kvoexY6e8JmCTqAB1",
          "symbol": "QUEST",
          "name": "QUEST",
          "decimals": 4,
          "logoURI": "https://questcoin.org/logo500x500.png",
          "tags": [],
          "extensions": {
            "website": "https://questcoin.org/"
          }
        },
        {
          "chainId": 101,
          "address": "xxxxa1sKNGwFtw2kFn8XauW9xq8hBZ5kVtcSesTT9fW",
          "symbol": "SLIM",
          "name": "Solanium",
          "decimals": 6,
          "logoURI": "https://cdn.jsdelivr.net/gh/solana-labs/token-list/assets/mainnet/xxxxa1sKNGwFtw2kFn8XauW9xq8hBZ5kVtcSesTT9fW/logo.png",
          "tags": [],
          "extensions": {
            "website": "https://solanium.io/"
          }
        },
        {
          "chainId": 101,
          "address": "2rEiLkpQ3mh4DGxv1zcSdW5r5HK2nehif5sCaF5Ss9E1",
          "symbol": "RECO",
          "name": "Reboot ECO",
          "decimals": 0,
          "logoURI": "https://reboot.eco/reco_logo.png",
          "tags": [],
          "extensions": {
            "website": "https://reboot.eco/"
          }
        }
      ],
      "version": {
        "major": 0,
        "minor": 2,
        "patch": 0
      }
    }
""".trimIndent()