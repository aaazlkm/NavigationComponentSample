# NavigationComponentSample
NavigationComponentのサンプルアプリ

以下の機能を実装している
- SafeArgsを使用した画面遷移
- アニメーションを使用した画面遷移

## 概要

- 公式ページ
  - https://developer.android.com/guide/navigation?hl=ja
- 主要なコンポーんえと
  - ナビゲーショングラフ
    - 全てのナビゲーション情報を一つの場所で集中的に管理する XML ソース
  - `NavHost`
    - ナビゲーショングラフからの宛先を表示するからのコンテナ
    - デフォルトで`NavHostFragment`がある
  - `NavController`
    - `NavHost`ないのねびゲーションを管理するオブジェクト
- 移動方法
  - 以下を`NavController`に伝える
    - 1 ナビゲーショングラフの特定のパスを辿って移動するか
    - 2 とくての宛先に直接移動するか

## スタート

- 1 ナビゲーショングラフを作成する
  - ナビゲーショングラフとは
    - 全てのデスティネーションとアクションを格納するリソースファイル
  - デスティネーション: 画面
  - アクション: 画面間の遷移動作のこと
- 2 NavHost をアクティビティに追加する
  - ナビゲーションコンポーネントの中核部分の一つ
  - 空のコンテナであり、この中ででディスティネーションが入れ替わることで画面遷移が行われる
  - NavHostFragment がデフォルトで提供されている
- 3 ナビゲーショングラフにデスティネーションを追加する
- 4 デスティネーションの構造
  - type: 実装が fragment か activity か
  - id: フィールドコード内でディスティネーションを参照する際に使用される
  - 色々
- 5 画面を開始デスティネーションとして指定する
  - ホームアイコンで指定
- 6 デスティネーションを接続する
  - action によりデスティネーションが紐づけられる
    - 自身の ID
    - 遷移先のデスティネーションの ID
- 7 遷移する
  - `NavHost`がもつ`NavController`を使用して遷移する。以下取得方法
    - Fragment.findNavController()
    - View.findNavController()
    - Activity.findNavController(viewId: Int)
- 8 safeargs を使用してタイプセーフな実装に
  - 具他的な実装方法： https://developer.android.com/guide/navigation/navigation-pass-data?hl=ja#Safe-args
  - action ごとにクラスが生成されることによって、安全に渡すことができるっぽい
